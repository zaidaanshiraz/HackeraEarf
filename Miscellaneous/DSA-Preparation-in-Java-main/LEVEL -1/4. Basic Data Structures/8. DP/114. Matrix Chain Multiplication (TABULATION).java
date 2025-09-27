//Ques->https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1/

class Solution{
    static int matrixMultiplication(int N, int nums[])
    {
        // code here
            int[][] dp = new int[N + 1][N + 1];
        
        for(int gap=1; gap<N-1; gap++){
            for(int l=0, r=gap; r<N-1; l++, r++){
                
                int minCost = Integer.MAX_VALUE;
                // Creating partitions
                for(int k=l; k<r; k++){
                    // Left Matrices -> Multiplication Min Cost
                    int left = dp[l][k];
                    // Right Matrices -> Multiplication Min Cost
                    int right = dp[k + 1][r];
                    // Left * Right Multiplication Cost
                    int cost = left + (nums[l] * nums[k + 1] * nums[r + 1]) + right;
                    minCost = Math.min(minCost, cost);
                }
                
                dp[l][r] = minCost;
            }
        }
        
        return dp[0][N - 2];
    }