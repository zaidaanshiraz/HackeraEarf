// 4) Count Dyk Paths (Paths in Lower Left or Upper Right Triangle)
// Answer(n) = Catalan(n - 1)
// GfG: https://practice.geeksforgeeks.org/problems/dyck-path1028/1
class Solution {
    static Long dyckPaths(int n) {
        // code here
                  long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j] * dp[i - j - 1];
                
        return  dp[n];
    }
};