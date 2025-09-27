//Ques->https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1

class Solution {
    // Memoization Approach 1: Time - O(Cap * N * Cap), Space - O(Cap * N)
    // Since Time is Cubic, It is Giving Time Limit Exceeded (TLE)
    static int memo(int index, int cap, int cost[], int wt[], int N, int[][] dp) {
        if (index == N || cap == 0)
            return 0;
        if (dp[index][cap] != -1)
            return dp[index][cap];

        int ans = -1;
        for (int freq = 0; cap >= freq * wt[index]; freq++) {
            int temp = memo(index + 1, cap - freq * wt[index], cost, wt, N, dp)
                    + freq * cost[index];
            ans = Math.max(ans, temp);
        }
        return dp[index][cap] = ans;
    }

    static int knapSack(int N, int cap, int cost[], int wt[]) {
        int[][] dp = new int[N + 1][cap + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= cap; j++) {
                dp[i][j] = -1;
            }
        }

        return memo(0, cap, cost, wt, N, dp);
    }
}