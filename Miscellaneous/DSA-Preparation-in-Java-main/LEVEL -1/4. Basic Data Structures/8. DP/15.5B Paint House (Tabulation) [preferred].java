//Ques->https://nados.io/question/paint-house?zen=true

//Code
//Ques->https://www.lintcode.com/problem/515/description

//Code
public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] arr) {
        // write your code here]
        int n=arr.length;
        if(arr.length==0)
        return 0;
int [][]dp=new int[n+1][3];
        dp[0][0]=arr[0][0];
dp[0][1]=arr[0][1];
dp[0][2]=arr[0][2];
for(int i=1;i<arr.length;i++)
{
    dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0];
   dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1];
    dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1])+arr[i][2];
  
}
return Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));

    }
}