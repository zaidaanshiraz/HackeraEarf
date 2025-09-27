def countPairs(strs):
    def similarStrings(s1, s2):
        return sorted(s1) == sorted(s2)

    count = 0
    for i in range(len(strs)):
        for j in range(i+1, len(strs)):
            if similarStrings(strs[i], strs[j]):
                count += 1
    return count