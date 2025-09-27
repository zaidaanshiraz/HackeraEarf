//Ques->https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1

class Solution {
    // Tabulation 1D DP: Time - O(Cap * N), Space - O(Cap)
    static int knapSack(int N, int caps, int cost[], int wt[]) {
        int[] dp = new int[caps + 1];

        for (int item = 1; item <= N; item++) {
            for (int cap = 1; cap <= caps; cap++) {
                int no = dp[cap];
                int yes = (cap >= wt[item - 1])
                        ? dp[cap - wt[item - 1]] + cost[item - 1]
                        : -1;

                dp[cap] = Math.max(no, yes);
            }
        }

        return dp[caps];
    }
}