//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1, high = arr.length - 2;
        while(low <= high){
            int mid = low + (high - low) / 2;
            
       int lval=(mid-1>=0)?arr[mid-1]:Integer.MIN_VALUE;
       int rval=(mid+1<arr.length)?arr[mid+1]:Integer.MIN_VALUE;
       if(arr[mid]>lval&&arr[mid]>rval)
       {
        return mid;
       }
       else if(lval>arr[mid]&&arr[mid]>rval)
       {
        high=mid-1;
       }
       else if(lval<arr[mid]&&rval>arr[mid]){
        low=mid+1;
       }
       else
       {
        if(arr[low]<=arr[high])low++;
        else high--;
       }
        }
        return -1;
        
    }
}