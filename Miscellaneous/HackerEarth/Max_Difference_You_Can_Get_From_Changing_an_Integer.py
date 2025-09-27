class Solution:
    def maxDiff(self, n: int) -> int:
        return (9 * (10**(len(str(n)) - 1))) + (n % 10)