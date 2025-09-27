//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/one-repeating-and-one-missing-official/ojquestion

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
   for(int i=1;i<=arr.length;i++)
   xxor^=i;
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
      for(int i=1;i<=arr.length;i++)
   {
         if((i&rmsb)==0)
       {x=x^i;
           
       }else
       {
           y=y^i;
       }
   }
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]==x)
    {
      System.out.println("Missing Number -> "+y);
      System.out.println("Repeating Number -> "+x);
      break;
    }else  if(arr[i]==y)
    {
      System.out.println("Missing Number -> "+x);
      System.out.println("Repeating Number -> "+y);  
      break;
      
    }
   }
  }

}