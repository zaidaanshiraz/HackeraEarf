//Ques->https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/radix-sort-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    // write code here 
    int max=Integer.MIN_VALUE;
    for(int val:arr)
    {
        if(val>max)
        max=val;
    }
    int digits=(int)Math.log10(max)+1;
    int pow=(int)Math.pow(10,digits-1);
    for(int i=1;i<=pow;i*=10)
    countSort(arr,i);
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    System.out.print("After sorting on " + exp + " place -> ");
       int []freq=new int[10];
   for(int i=0;i<arr.length;i++)
   {
       int idx=(arr[i]/exp)%10;
       freq[idx]++;
   }
int []prefixSum=new int[10];
prefixSum[0]=freq[0];
for(int i=1;i<prefixSum.length;i++)
{
    prefixSum[i]=prefixSum[i-1]+freq[i];
}
int []res=new int[arr.length];
for(int i=arr.length-1;i>=0;i--)
{
    int idx=(arr[i]/exp)%10;
    prefixSum[idx]--;
    res[prefixSum[idx]]=arr[i];
}
for(int i=0;i<arr.length;i++)
arr[i]=res[i];
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}