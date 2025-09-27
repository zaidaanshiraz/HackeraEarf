//https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int lval=(mid-1>=0)?nums[mid-1]:Integer.MIN_VALUE;
            int rval=(mid+1<nums.length)?nums[mid+1]:Integer.MIN_VALUE;
            if(lval!=nums[mid]&&rval!=nums[mid])
                return nums[mid];
            if((mid%2==1&&nums[mid-1]==nums[mid])||(mid%2==0&&nums[mid+1]==nums[mid]))
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}