//Ques->https://leetcode.com/submissions/detail/692157932/

//Code
class Solution {
    public int rob(int[] nums) {

        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
                int maxSum=getMaxSum(nums,0,dp);
    return maxSum;
    }
    public int getMaxSum(int []nums,int idx,int dp[])
    {
        if(idx>=nums.length) 
            return 0;
        if(idx==nums.length-1)
            return nums[idx];
        if(dp[idx]!=-1)
            return dp[idx];
        int idxIncludeSum=getMaxSum(nums,idx+2,dp);
        int idxExcludeSum=getMaxSum(nums,idx+1,dp);
        
        return dp[idx]=Math.max(nums[idx]+idxIncludeSum,idxExcludeSum);
    }
}