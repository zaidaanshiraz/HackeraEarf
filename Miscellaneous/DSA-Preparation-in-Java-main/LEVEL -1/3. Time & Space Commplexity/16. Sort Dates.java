//Ques->https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/sort-dates-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    // write your code here
//sort on bases on dates
countSort(arr,1000000,100,32);
//sort on bases on months
countSort(arr,10000,100,13);
//sort on bases on year
countSort(arr,1,10000,2501);
    
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    // write your code here
    int []freq=new int[range];
    for(int i=0;i<arr.length;i++)
    {
        int val=Integer.parseInt(arr[i],10);
        int idx=(val/div)%mod;
        freq[idx]++;
    }
    int []prefixSum=new int[range];
    prefixSum[0]=freq[0];
    for(int i=1;i<prefixSum.length;i++)
    {
        prefixSum[i]=prefixSum[i-1]+freq[i];
    }
    String []res=new String[arr.length];
    for(int i=arr.length-1;i>=0;i--)
    {
        int val=Integer.parseInt(arr[i],10);
        int idx=(val/div)%mod;
        prefixSum[idx]--;
        res[prefixSum[idx]]=arr[i];
    }
    for(int i=0;i<arr.length;i++)
    arr[i]=res[i];
    


  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}