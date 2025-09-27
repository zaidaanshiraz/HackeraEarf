//https://leetcode.com/problems/maximum-width-ramp/

class Solution {
    public int maxWidthRamp(int[] nums) {
      int []rmax=new int[nums.length];
        int n=nums.length;
        rmax[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(nums[i],rmax[i+1]);
        }
        int i=0,j=0;
        int ans=0;
        while(i<n&&j<n)
        {
            if(nums[i]<=rmax[j])
            {
                ans=Math.max(ans,j-i);
                j++;
            }else i++;
        }
        return ans;
    }
}