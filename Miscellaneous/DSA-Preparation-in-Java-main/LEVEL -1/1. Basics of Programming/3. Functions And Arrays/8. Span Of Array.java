//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span-of-array-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int max=Integer.MIN_VALUE;
    int mIN=Integer.MAX_VALUE;
    int n=scn.nextInt();
    int []arr=new int[n];

for(int i=0;i<n;i++)
arr[i]=scn.nextInt();
    
    for(int i=0;i<n;i++)
    {
        if(max<arr[i])
        max=arr[i];
        if(mIN>arr[i])
        mIN =arr[i];
    }
System.out.println(max-mIN);
}
}