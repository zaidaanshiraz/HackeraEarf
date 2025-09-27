//Ques->https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1

class Solution {
    // Memoization Approach 1: Time - O(Cap * N * Cap), Space - O(Cap * N)
    // Since Time is Cubic, It is Giving Time Limit Exceeded (TLE)
     // Memoization Approach 2: Time - O(Cap * N), Space - O(Cap * N)
    // Now, It is Quadratic, hence giving Accepted
     static int knapSack(int N, int caps, int cost[], int wt[]) {
        int[][] dp = new int[N + 1][caps + 1];

        for (int item = 1; item <= N; item++) {
            for (int cap = 1; cap <= caps; cap++) {
                int no = dp[item - 1][cap];
                int yes = (cap >= wt[item - 1])
                        ? dp[item][cap - wt[item - 1]] + cost[item - 1]
                        : -1;

                dp[item][cap] = Math.max(no, yes);
            }
        }

        return dp[N][caps];
    }
}