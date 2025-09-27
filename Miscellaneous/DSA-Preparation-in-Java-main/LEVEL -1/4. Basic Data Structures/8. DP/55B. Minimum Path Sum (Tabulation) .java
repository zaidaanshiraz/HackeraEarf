//Ques->https://leetcode.com/problems/minimum-path-sum/

//Code
class Solution {
    public int minPathSum(int[][] grid) {
         int[] dp = new int[grid[0].length + 1];
            for(int j=0; j<=grid[0].length; j++){
                dp[j] = Integer.MAX_VALUE;
            }
            
            for(int i=grid.length-1; i>=0; i--){
                for(int j=grid[0].length-1; j>=0; j--){
                    if(i == grid.length - 1 && j == grid[0].length - 1){
                        dp[j] = grid[i][j];
                        continue;
                    }
                    
                    dp[j] = Math.min(dp[j], dp[j + 1]) + grid[i][j];
                }
            }
        
            return dp[0];
    }
}