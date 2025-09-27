//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/sum-of-bit-differences-of-all-pairs-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static long solution(int[] arr){
    //write your code here
    long res=0;
    for(int i=0;i<32;i++)
    {
        long count=0;
        for(int val:arr)
        {
            if((val&(1<<i))!=0)
            {
              count++;  
            }
        }
        long off=arr.length-count;
        long diff=count*off*2;
        res+=diff;
    }
    return res;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}