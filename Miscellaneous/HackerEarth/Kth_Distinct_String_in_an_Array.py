def kthDistinctString(nums, k):
    from collections import Counter
    counter = Counter({num: 1 for num in nums})
    distinct = [num for num in counter if counter[num] == 1]
    return distinct[k - 1] if k <= len(distinct) else ""