//Ques->https://www.lintcode.com/problem/516/

//Code
public class Solution {
    /**
     * @param costs: n x k cost matrix
     * @return: an integer, the minimum cost to paint all houses
     */
    public int minCostII(int[][] costs) {
        // write your code here
           // write your code here]
        int n=costs.length;
        if(n==0)
        return 0;
int min1=Integer.MAX_VALUE;        
        int k=costs[0].length;
        if(costs.length==0)
        return 0;
int [][]dp=new int[n+1][k];
for(int c=0;c<k;c++)
{
    dp[0][c]=costs[0][c];
}
for(int i=1;i<n;i++)
{
    for(int c=0;c<k;c++)
    {
        int min=Integer.MAX_VALUE;
        for(int prev=0;prev<k;prev++)
        {
            if(prev==c)
            continue;
            min=Math.min(min,dp[i-1][prev]);
        }
        dp[i][c]=costs[i][c]+min;
    }
    
   
  
}
for(int c=0;c<k;c++)
   min1=Math.min(dp[n-1][c],min1);
 return min1; 

    }


    
}