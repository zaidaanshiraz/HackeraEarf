class Calculator:
    def __init__(self):
        self.res = 0

    def calculate(self, s: str) -> int:
        i = 0
        while i < len(s):
            if s[i].isdigit():
                j = i
                while i < len(s) and s[i].isdigit():
                    i += 1
                return self.res if self.res == 0 else int(s[j:i]) + self.calculate(s[i+1:].lstrip())

            if s[i] in {'+', '-'}:
                sign = '+' if s[i] == '+' else '-'
                i += 1

            elif s[i] in {'*', '/'}:
                res, i = self.helper(int(self.res), int(s[i-1]), s[i], int(s[i+1]) if i < len(s) - 1 else 0)
                self.res = res
                return res

        return self.res

    def helper(self, a: int, op: str, b: int) -> tuple:
        if op == '+':
            return a + b, 0
        elif op == '-':
            return a - b, 0
        elif op == '*':
            return a * b, 0
        else:
            if b == 0:
                raise ZeroDivisionError
            return a // b, 0