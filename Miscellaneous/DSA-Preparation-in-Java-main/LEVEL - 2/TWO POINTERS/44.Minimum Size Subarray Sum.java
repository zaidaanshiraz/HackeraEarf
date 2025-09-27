//https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left=0;
        int len=Integer.MAX_VALUE;
        int currSum=0;
    for(int right=0;right<nums.length;right++)
    {
        currSum+=nums[right];
        while(currSum>=target)
        {
                len=Math.min(len,right-left+1);
            currSum-=nums[left];
            left++;
        }

    }
        return (len!=Integer.MAX_VALUE)?len:0;
    }
}