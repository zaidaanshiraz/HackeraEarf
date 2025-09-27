class Solution:
    def findContinuousSequence(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        res = []
        for i in range(n - 2):
            if nums[i] + 2 > nums[i+1]:
                break
            l, r = i+1, n-1
            while l < r:
                s = (nums[l] + nums[r] + nums[i]) // 3
                if nums[l] + nums[r] == 2*s:
                    res.append([s,s,s])
                    while l < r and nums[l] + nums[r] == 2*s:
                        l +=1
                        r -=1
                elif nums[l] + nums[r] < 2*s:
                    l +=1
                else: 
                    r -=1
        return res