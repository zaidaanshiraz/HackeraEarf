def countOrders(n):
    MOD = 10**9 + 7
    res = 0
    for i in range(1, n+1):
        for j in range(i, n+1):
            res += (n - i) * (n - i + 1) // 2 * (n - j) * (n - j + 1) // 2
    return res % MOD