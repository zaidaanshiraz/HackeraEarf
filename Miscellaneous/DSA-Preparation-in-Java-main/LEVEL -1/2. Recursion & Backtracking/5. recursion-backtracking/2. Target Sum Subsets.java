//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/target-sum-subsets-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++)
arr[i]=scn.nextInt();
int tar=scn.nextInt();
printTargetSumSubsets(arr,0,"",0,tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String ans, int sum, int tar) {
        
        if(arr.length<=idx)
        {
            if(sum==tar)
            System.out.println(ans+".");
            return;
        }
int val=arr[idx];
if(idx<=arr.length-1)
printTargetSumSubsets(arr,idx+1,ans+val+", ",sum+val,tar);
printTargetSumSubsets(arr,idx+1,ans,sum,tar);

}

}