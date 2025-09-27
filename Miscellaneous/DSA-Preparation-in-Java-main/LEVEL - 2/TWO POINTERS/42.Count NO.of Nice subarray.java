//https://leetcode.com/problems/count-number-of-nice-subarrays/

class Solution {
    public int helper(int []nums,int k)
    {
        int left=0;
        int count=0;
        int nice=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]%2==1)
                nice++;
            while(nice>k)
            {
                if(nums[left]%2==1)
                    nice--;
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      return helper(nums,k)-helper(nums,k-1);  
    }
}
