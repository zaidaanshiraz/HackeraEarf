//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/friends-pairing-2-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {
  static int counter = 1;

  public static void solution(int i, int totalFriends, boolean[] friendInGroup, String groupsSofar) {
      if(i > totalFriends){
        // Positive Base Case : All friends are processed
        System.out.println(counter + "." + groupsSofar);
        counter++;
        return;
      }
      
      if(friendInGroup[i] == true){
          solution(i + 1, totalFriends, friendInGroup, groupsSofar);
          return;
      }
      
      // Group of 1 Member
      friendInGroup[i] = true;
      solution(i + 1, totalFriends, friendInGroup, groupsSofar + "(" + i + ") ");
      
      for(int j=1; j<=totalFriends; j++){
          if(friendInGroup[j] == false){
              friendInGroup[j] = true;
              solution(i + 1, totalFriends, friendInGroup, groupsSofar + "(" + i + "," + j + ") ");
              friendInGroup[j] = false;
          }
      }
      
      friendInGroup[i] = false;
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] friendInGroup = new boolean[n + 1];
    solution(1, n, friendInGroup, "");
  }
}