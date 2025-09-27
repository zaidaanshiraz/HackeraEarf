class Solution:
    def minimumTimeRequired(self, jobs: List[int]) -> int:
        n = len(jobs)
        res = float('inf')
        for x in range(min(jobs), sum(jobs) + 1):
            if all((x - y) % 2 == 0 or (x // 2 >= y) for y in jobs):
                res = min(res, x)
        return res