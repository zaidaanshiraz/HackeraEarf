//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/first-index-last-index-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [] nums=new int[n];
    for(int i=0;i<n;i++)
    nums[i]=scn.nextInt();
    int target=scn.nextInt();
     int []arr=new int[2];
    
  System.out.println(arr[0]=firstOcc(nums,target));
        System.out.println(arr[1]=lastOcc(nums,target));
        
    }
    public static int firstOcc(int [] nums,int target)
    {
            int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right)
        {
            int mid=left + (right-left)/2;
            if(nums[mid]==target)
            {ans=mid;
                right=mid-1;}
            else if(nums[mid]<target)
                left=mid+1;
            else if(nums[mid]>target)
                right=mid-1;
                
        }
        return ans;
    }
    public static int lastOcc(int [] nums,int target)
    {
            int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right)
        {
            int mid=left + (right-left)/2;
            if(nums[mid]==target)
            {ans=mid;
                left=mid+1;}
            else if(nums[mid]<target)
                left=mid+1;
            else if(nums[mid]>target)
                right=mid-1;
                
        }
        return ans;
    }

}