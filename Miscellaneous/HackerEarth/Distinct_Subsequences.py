class Solution:
    def distinctSubsequences(self, s: str) -> int:
        m = len(s)
        dp = [[0] * (m + 1) for _ in range(m + 1)]
        for i in range(m):
            dp[i][i+1] = 1
        for length in range(2, m + 1):
            for start in range(m - length + 1):
                end = start + length
                if s[start] == s[end-1]:
                    dp[start][end] = dp[start][end-1] + (1 if length > 2 else 0)
                else:
                    dp[start][end] = dp[start+1][end-1]
        return sum(1 for x in dp[0])