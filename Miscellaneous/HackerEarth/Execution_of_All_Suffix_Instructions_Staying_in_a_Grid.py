def executeInstructions(grid, start):
    m, n = len(grid), len(grid[0])
    ans = []
    for k in range(start[1], n):
        x, y = start
        for d in [(0, 1), (1, 0), (-1, 0), (0, -1)]:
            if k + d[1] >= 0 and k + d[1] < m and k + d[0] >= 0 and k + d[0] < n and grid[k + d[1]][k + d[0]] == 'H':
                ans.append([1, x, y])
                break
        else:
            continue
    return ans