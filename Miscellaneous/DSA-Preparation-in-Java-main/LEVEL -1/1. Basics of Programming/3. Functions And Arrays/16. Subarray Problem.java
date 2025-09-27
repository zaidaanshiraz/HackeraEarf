//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subarray-problem-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int [] a =new int[n];
    for(int i=0;i<n;i++)
    a[i]=scn.nextInt();
     for(int st=0;st<n;st++)
     {
          for(int end=st;end<n;end++)
          {
               for(int i=st;i<=end;i++)
               System.out.print(a[i]+"	");
               System.out.println();
               
          }
     }
 }

}