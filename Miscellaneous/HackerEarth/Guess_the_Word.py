class Solution:
    def getHint(self, secret: str, guess: str) {
        a = sum(i == j for i, j in zip(secret, guess)) - 1
        b = len(guess) - a
        return f"{a}A{b}B" if a > 0 or b > 0 else "0A0B"
    }