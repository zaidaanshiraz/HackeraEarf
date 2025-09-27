def scoreOfParentheses(s):
    score = 0
    stack = []
    for i in range(len(s)):
        if s[i] == "(":
            stack.append(1)
        elif s[i] == ")":
            tmp = 0
            while stack and stack[-1] != 1:
                tmp += 2 * stack.pop()
            if stack: 
                stack.pop() 
                score += tmp + 1
            else: 
                score += tmp
    return score