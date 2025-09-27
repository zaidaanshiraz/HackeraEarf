//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public boolean isMin(int mid,int []nums)
    {
        if(mid>0&&mid<nums.length-1)
        {
            if(nums[mid-1]>nums[mid]&&nums[mid]<nums[mid+1])
                return true;
        }
        if(mid==0) return false;
        if(mid==nums.length-1)
        {
            if(nums[mid-1]>nums[mid])
                return true;
        }
        return false;
    }
        public boolean isMax(int mid,int []nums)
    {
        if(mid>0&&mid<nums.length-1)
        {
            if(nums[mid-1]<nums[mid]&&nums[mid]>nums[mid+1])
                return true;
        }
        if(mid==nums.length-1) return false;
        if(mid==0)
        {
            if(nums[mid+1]<nums[mid])
                return true;
        }
        return false;
    }
    
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if(nums.length==1)
            return nums[0];
        if(nums[0]<nums[right])
            return nums[0];
        while(left <= right){
            int mid = left + (right - left) / 2;
        
 if(isMin(mid,nums)==true)
    return nums[mid];
            else if(isMax(mid,nums)==true)
    return nums[mid+1];
            else if(nums[mid] >= nums[left]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // Corner Case: Sorted Array without Rotations
        return nums[left];
    }
}