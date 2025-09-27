class Solution:
    def arrayPairsDiff(self, arr: List[int]) -> int:
        return sum(abs(a - b) for a, b in zip(arr, [i + 1 for i in arr]))