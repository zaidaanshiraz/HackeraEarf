def visiblePoints(arr, x):
    n = len(arr)
    res = 0
    mx = max(arr)
    for i in range(n):
        temp = [arr[j] for j in range(i+1)]
        while temp and abs(temp[-1] - arr[i]) <= x:
            temp.pop()
        res = max(res, len(temp))
    return min(res, n) + min(max(0, mx-x), 1)