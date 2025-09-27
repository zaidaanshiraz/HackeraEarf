def maxDifference(grid):
    m, n = len(grid), len(grid[0])
    dp = [[0]*n for _ in range(m)]
    dp[0] = [grid[i][j] for j in range(n)]
    
    for i in range(1, m):
        for j in range(n):
            if j == 0:
                dp[i][j] = max(dp[i-1][j], grid[i][j]) - grid[i-1][j]
            else:
                dp[i][j] = max(max(dp[i-1][:j+1]), grid[i][j]) - grid[i-1][j]
    
    return max(max(row) for row in dp)