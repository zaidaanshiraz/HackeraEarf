class Solution:
    def descendingOrder(self, n: str) -> str:
        return ''.join(str(i) for i in sorted(int(n), reverse=True))