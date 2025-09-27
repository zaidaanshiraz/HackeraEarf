//https://leetcode.com/problems/house-robber-ii/submissions/

//Code
class Solution {
    
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
  public int rob(int[] nums,int start ,int end) {

        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
                int maxSum=getMaxSum(nums,start,end,start,dp);
    return maxSum;
    }
    public int getMaxSum(int []nums,int start ,int end ,int idx,int dp[])
    {
        
        if(idx>=end+1) 
            return 0;
        if(idx==end)
            return nums[idx];
        if(dp[idx]!=-1)
            return dp[idx];
        int idxIncludeSum=getMaxSum(nums,start,end,idx+2,dp);
        int idxExcludeSum=getMaxSum(nums,start,end,idx+1,dp);
        
        return dp[idx]=Math.max(nums[idx]+idxIncludeSum,idxExcludeSum);
    }
}