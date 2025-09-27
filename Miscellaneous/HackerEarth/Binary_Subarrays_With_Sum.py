def numSubarraysWithSum(N, nums):
    res = 0
    for i in range(len(nums)):
        left_sum = 0
        right_sum = 0
        for j in range(i, len(nums)):
            if nums[j] == 1:
                left_sum += 1
            else:
                left_sum += -1
            if left_sum + N == 0:
                res += 1
            right_sum += nums[j]
            if right_sum == N:
                res += j - i + 1
    return res