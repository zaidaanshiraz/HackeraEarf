class Solution:
    def minSumOfArray(self, nums: List[int], k: int) -> int:
        n = len(nums)
        dp = [float('inf')] * (n + 1)
        dp[0] = 0
        for i in range(n):
            for j in range(i + 1, min(i + k + 1, n)):
                dp[j] = min(dp[j], nums[i] + dp[i])
        return dp[n - 1]