//https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int right=1;
        int count=0;
        while(left<nums.length&&right<nums.length)
        {
            if(left>0&&nums[left]==nums[left-1])
            {
                left++;
                continue;
            }
            if(left==right)
            {right++;
             continue;
            }
            int diff=nums[right]-nums[left];
            if(diff==k)
            {
                count++;
                left++;
            }else if(diff<k)
                right++;
            else
                left++;
        }
        return count;
    }
}