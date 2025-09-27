def canJump(candidates):
    max_reach = 0
    for i, x in enumerate(candidates):
        if i > max_reach:
            return False
        max_reach = max(max_reach, i + x)
    return True