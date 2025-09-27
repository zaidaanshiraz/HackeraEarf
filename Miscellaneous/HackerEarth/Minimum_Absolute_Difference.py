class Solution:
    def minimumAbsDifference(self, nums):
        nums.sort()
        res = []
        for i in range(1, len(nums)):
            if nums[i] - nums[i-1] < min(res) if res else float('inf'):
                res = [nums[i-1], nums[i]]
        return res