//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    int d=scn.nextInt();
    int low=0;
    int high=n-1;
    while(low<=high)
    {
        int mid=low + (high-low)/2;
        if(arr[mid]<d)
        low=mid+1;
        else
        high=mid-1;
        
    }

 System.out.println(arr[low]);
  System.out.println(arr[high]);
 }

}