def new21game(N, K, W):
    dp = [0] * (N + 1)
    dp[0] = 1
    totalProb = 1.0 / W if N >= K else 0
    for i in range(1, K):
        dp[i] = 1 - totalProb
    for i in range(K, N + 1):
        dp[i] = (dp[i - 1] + totalProb) - totalProb
        totalProb *= 1 / W
    return sum(dp[K:])