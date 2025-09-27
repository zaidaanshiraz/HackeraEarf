//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/kernighans-algo-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code herei
    int count=0;
    while(n!=0)
    {
        int rmsb=n&-n;
        n=n-rmsb;
        count++;
    }
    System.out.println(count);
  }

}