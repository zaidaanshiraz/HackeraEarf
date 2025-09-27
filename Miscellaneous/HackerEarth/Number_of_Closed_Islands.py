def closedIsland(grid):
    m, n = len(grid), len(grid[0])
    directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    
    def dfs(i, j):
        if i < 0 or i >= m or j < 0 or j >= n or grid[i][j] == 0:
            return False
        grid[i][j] = 0
        for d in directions:
            if not dfs(i + d[0], j + d[1]):
                return False
        return True
    
    count = 0
    for i in range(m):
        for j in range(n):
            if i == 0 or j == 0 or i == m - 1 or j == n - 1:
                if dfs(i, j):
                    count += 1
    return count