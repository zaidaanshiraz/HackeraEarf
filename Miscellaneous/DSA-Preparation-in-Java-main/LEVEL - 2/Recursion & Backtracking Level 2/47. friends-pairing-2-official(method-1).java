//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/friends-pairing-2-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {
  static int counter = 1;

  public static void solution(int totalFriends, boolean[] friendInGroup, String groupsSofar) {
      int i = 0;
      for(int j=1; j<=totalFriends; j++){
          if(friendInGroup[j] == false){
              i = j;
              break;
          }
      }
      
      if(i == 0){
        // Positive Base Case : All friends are processed
        System.out.println(counter + "." + groupsSofar);
        counter++;
        return;
      }
      
      // Group of 1 Member
      friendInGroup[i] = true;
      solution(totalFriends, friendInGroup, groupsSofar + "(" + i + ") ");
      
      for(int j=1; j<=totalFriends; j++){
          if(friendInGroup[j] == false){
              friendInGroup[j] = true;
              solution(totalFriends, friendInGroup, groupsSofar + "(" + i + "," + j + ") ");
              friendInGroup[j] = false;
          }
      }
      
      friendInGroup[i] = false;
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] friendInGroup = new boolean[n + 1];
    solution(n, friendInGroup, "");
  }
}