//Ques->https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/target-sum-pair-1-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);
    int left=0,right=arr.length-1;
    while(left<right)
    {
        if(arr[left]+arr[right]==target)
        {
            System.out.println(arr[left]+", "+arr[right]);
            left++;right--;
        }
        else if(arr[left]+arr[right]<target)
        left++;
        else
        right--;
    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}