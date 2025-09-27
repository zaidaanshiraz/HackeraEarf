//https://www.interviewbit.com/problems/search-in-bitonic-array/

public class Solution {
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
    public int solve(int[] A, int B) {
        int peakIdx=peakIndexInMountainArray(A);
        if(A[peakIdx]==B) return peakIdx;
        if(A[peakIdx]<B) return -1;
        int left=binarySearch(A,0,peakIdx-1,B,true);
        if(left!=-1)
        return left;
        return binarySearch(A,peakIdx+1,A.length-1,B,false);

    }
    public int binarySearch(int []A,int left,int right,int target,boolean isInc)
    {
        if(left>right) return -1;
        int mid=left+(right-left)/2;
        if(A[mid]==target)return mid;
        if((isInc==true&&A[mid]<target)||(isInc==false&&A[mid]>target))
        {
            return binarySearch(A,mid+1,right,target,isInc);
        }else
        return binarySearch(A,left,mid-1,target,isInc);
    }
}
