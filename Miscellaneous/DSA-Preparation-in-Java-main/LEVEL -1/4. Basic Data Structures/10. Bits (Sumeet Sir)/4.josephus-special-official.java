//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/josephus-special-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int n){
    //write your code here
        int hpow=findHighestPower(n);
        int l=n-hpow;
        int ans=2*l+1;
    return ans;
  }
  public static int findHighestPower(int n)
  {
      int i=1;
      while(i*2<=n)
      {
          i=i*2;
      }
      return i;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    System.out.println(solution(n));
  }
  

}