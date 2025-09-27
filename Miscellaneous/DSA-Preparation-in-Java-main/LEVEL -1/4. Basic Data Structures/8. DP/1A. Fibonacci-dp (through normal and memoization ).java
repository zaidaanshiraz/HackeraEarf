//Ques->https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fibonacci-dp-official/ojquestion

//Code
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    // int ans1=fib(n);
    int ans2=fib_mem(n,new Integer[n+1]);
    // System.out.println(ans1);
    System.out.println(ans2);
 }
 public static int fib(int n)
 {
     if(n==1||n==0)
     {
         return n;
     }
     int fib1=fib(n-1);
     int fib2=fib(n-2);
     int Fib=fib1+fib2;
     return Fib;
 }
 public static int fib_mem(int n,Integer []strg)
 {
    if(n==1||n==0)
     {
         return n;
     }
     if(strg[n]!=null)
     {
         return strg[n];
     }
     int fib1=fib_mem(n-1,strg);
     int fib2=fib_mem(n-2,strg);
     int Fib=fib1+fib2;
     strg[n]=Fib;
     return Fib; 
 }

}