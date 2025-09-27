//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int findFirstOcc(int []nums,int target)
    {
            int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
           int mid=low+((high-low)/2);
            if(nums[mid]>=target)
                high=mid-1;
            else if(nums[mid]<target)
                low=mid+1;
        }
        if(low==-1||low==nums.length||nums[low]!=target)
        return -1;
        return low;
    }
    public int findlastOcc(int []nums,int target)
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
        if(high==-1||high==nums.length||nums[high]!=target)
        return -1;
        return high;
    }
    public int[] searchRange(int[] nums, int target) {
        int  firstOcc=findFirstOcc(nums,target);
        int lastOcc=findlastOcc(nums,target);
        return new int[]{firstOcc,lastOcc};
    }
}