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
    }public class Solution {
    /**
     * @param costs: n x k cost matrix
     * @return: an integer, the minimum cost to paint all houses
     */
    public int minCostII(int[][] costs) {
        // write your code here
  int n = costs.length;
        if (n == 0)
            return 0;

        int k = costs[0].length;

        int[][] dp = new int[costs.length + 1][k];
        for (int c = 0; c < k; c++) {
            dp[0][c] = costs[0][c];
        }

        for (int i = 1; i < n; i++) {

            // Finding 1st Min and 2nd Min of Previous Row
            int firstMin = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int prev = 0; prev < k; prev++) {
                if (dp[i - 1][prev] <= firstMin) {
                    secondMin = firstMin;
                    firstMin = dp[i - 1][prev];
                } else if (dp[i - 1][prev] < secondMin) {
                    secondMin = dp[i - 1][prev];
                }
            }

            // Calculating Current Row DP Using 1st Min and 2nd Min
            for (int c = 0; c < k; c++) {
                if (dp[i - 1][c] == firstMin)
                    dp[i][c] = costs[i][c] + secondMin;
                else
                    dp[i][c] = costs[i][c] + firstMin;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int c = 0; c < k; c++) {
            min = Math.min(dp[n - 1][c], min);
        }
        return min;
    }
}
