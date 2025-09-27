//Ques->https://www.lintcode.com/problem/516/

//Code
public class Solution {
    /**
     * @param costs: n x k cost matrix
     * @return: an integer, the minimum cost to paint all houses
     */
        // write your code her
       public static int helper(int [][]costs,int idx,int k,int prev,int [][]dp)
     {
         if(idx==costs.length)
         return 0;
         if(prev>=0&&dp[idx][prev]!=-1)
         return dp[idx][prev];
         int min=Integer.MAX_VALUE;
for(int color=0;color<k;color++){
    min=Math.min(min,(prev==color)?Integer.MAX_VALUE:costs[idx][color]+helper(costs,idx+1,k,color,dp));
}
            if(prev==-1)
            return min;
            return dp[idx][prev]=min; 
     }
    public static int minCostII(int[][] costs) {
        // write your code here
         if(costs.length==0)
        return 0;
        int k=costs[0].length;
       
        int [][]dp=new int[costs.length+1][k];
        for(int i=0;i<=costs.length;i++)
        {
            for(int j=0;j<k;j++)
            dp[i][j]=-1;
        }
    return helper(costs,0,k,-1,dp);
    }
    }