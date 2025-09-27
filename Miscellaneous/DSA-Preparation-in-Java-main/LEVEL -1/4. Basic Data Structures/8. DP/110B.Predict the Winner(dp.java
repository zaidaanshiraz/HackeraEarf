//Ques->https://leetcode.com/problems/predict-the-winner/submissions/
class Solution {
    public boolean PredictTheWinner(int[] nums) {
                Integer [][]dp=new Integer[nums.length][nums.length];

        int ascore=helper(0,nums.length-1,nums,dp);
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];
        }
        int bscore=total-ascore;
        if(ascore>=bscore) return true;
        return false;
    }
    public int helper(int left,int right,int []nums,Integer [][]dp)
    {
if(left>right) return 0;
        if(left==right) return nums[left];
        if(dp[left][right]!=null)
            return dp[left][right];
        int c1=helper(left+2,right,nums,dp);
        int c2=helper(left+1,right-1,nums,dp);
        int c3=helper(left,right-2,nums,dp);
    return  dp[left][right]=Math.max(nums[left]+Math.min(c1,c2),nums[right]+Math.min(c2,c3));
    }
}