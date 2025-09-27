//Ques->https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/count-sort-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int []freq=new int[max-min+1];
   for(int i=0;i<arr.length;i++)
   {
       int val=arr[i];
       int idx=val-min;
       freq[idx]++;
   }
//   int []ans=new int[arr.length];
 int []prefixSum=new int[max-min+1];
 prefixSum[0]=freq[0];
 for(int i=1;i<prefixSum.length;i++)
 {
     prefixSum[i]=prefixSum[i-1]+freq[i];
 }
 int []ans=new int[arr.length];
 for(int i=arr.length-1;i>=0;i--)
 {
     int idx=arr[i]-min;
     prefixSum[idx]--;
     ans[prefixSum[idx]]=arr[i];
     
 }
 for(int i=0;i<ans.length;i++)
 {
     arr[i]=ans[i];
 }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}