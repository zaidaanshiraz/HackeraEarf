class Solution:
    def stoneGameIII(self, stoneValue: List[int]) -> str:
        n = len(stoneValue)
        dp = [0] * (n + 1)
        for i in range(n):
            if i < n - 2:
                dp[i + 3] = max(dp[i], stoneValue[i] - dp[i])
            else:
                dp[i + 1] = stoneValue[i]
            for j in range(i, min(i + 3, n)):
                dp[i + 3] = max(dp[i + 3], dp[j] + sum(stoneValue[k] for k in range(j)))
        if dp[n - 1] > dp[n - 2]:
            return "Alice"
        elif dp[n - 1] < dp[n - 2]:
            return "Bob"
        else:
            return "Tie"