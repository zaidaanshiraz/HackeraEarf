//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion

import java.io.*;
import java.util.*;

public class Main{

public static int findCeil(int target,int []nums)
{
       int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
           int mid=low+((high-low)/2);
            if(nums[mid]<=target)
                low=mid+1;
           else if(nums[mid]>target)
                high=mid-1;
            
        }
        if(low>=nums.length)
        return nums.length;
        return nums[low];
}
public static int findFloor(int target,int []nums)
{
    int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
           int mid=low+((high-low)/2);
            if(nums[mid]==target)
                return mid;
           else if(nums[mid]>target)
                high=mid-1;
            else if(nums[mid]<target)
                low=mid+1;
        }
        if(high==-1)
        return -1;
        return nums[high];
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++)
    arr[i]=scn.nextInt();
    int d=scn.nextInt();
    int ceil=findCeil(d,arr);
    int floor=findFloor(d,arr);
    System.out.println(ceil);
    System.out.println(floor);
 }

}