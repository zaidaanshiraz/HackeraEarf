//Ques->https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/

class Solution {
    public int maxProfit(int[] prices) {
     int [][]dp=new int[2][prices.length];
        dp[0][0]=-prices[0];
        dp[1][0]=0;
        for(int i=1;i<prices.length;i++)
        {
dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]-prices[i]);
            dp[1][i]=Math.max(dp[1][i-1],dp[0][i-1]+prices[i]);
        }
        return  Math.max(dp[1][prices.length-1],dp[0][prices.length-1]);
    }
}