//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/all-repeating-except-two-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   int xxor=0;
   for(int a:arr)
   xxor^=a;
   int rmsb=xxor&-xxor;
   int x=0;
   int y=0;
   for(int val:arr)
   {
       if((val&rmsb)==0)
       {x=x^val;
           
       }else
       {
           y=y^val;
       }
   }
   if(x<y)
   {
       System.out.println(x);
        System.out.println(y);
   }
   else
   {
           System.out.println(y);
        System.out.println(x);   
   }
   
  }

}