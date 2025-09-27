//Ques->https://leetcode.com/problems/combination-sum-iv/submissions/

//COde
class Solution {
    public int combinationSum4(int[] coins, int amount) {
        int []dp=new int[amount+1];
        Arrays.fill(dp,-1);
        return memo(amount,coins,dp);
    }
    public int memo(int amount,int []coins,int []dp)
    {
        if(amount<0) return 0;
        if(amount==0) return 1;
        if(dp[amount]!=-1) return dp[amount];
        int perm=0;
        for(int i=0;i<coins.length;i++)
        {
            perm+=memo(amount-coins[i],coins,dp);
        }
        return dp[amount]=perm;
    }
}