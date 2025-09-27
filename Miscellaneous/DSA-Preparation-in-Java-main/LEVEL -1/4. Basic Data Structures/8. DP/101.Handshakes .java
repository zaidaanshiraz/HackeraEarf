// 8) Count Non-Crossing Handshakes in Circular Table
// Answer(n) = Catalan(n / 2)
// GfG: https://practice.geeksforgeeks.org/problems/handshakes1303/1

class Solution{
    static int count(int N) 
    { 
        // code here
        int n=N/2;
                          long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j] * dp[i - j - 1];
                
        return  (int)dp[n];
    }
};