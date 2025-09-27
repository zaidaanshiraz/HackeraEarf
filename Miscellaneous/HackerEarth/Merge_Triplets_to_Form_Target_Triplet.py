def merge_triplets(triplets, targets):
    triplets.sort()
    result = []
    for target in targets:
        left, right = 0, len(triplets) - 1
        while left <= right:
            mid = (left + right) // 2
            if triplets[mid][0] == target[0]:
                if triplets[mid][1] == target[1]:
                    result.append(triplets.pop(mid))
                    break
                elif triplets[mid][1] < target[1]:
                    left = mid + 1
                else:
                    right = mid - 1
            elif triplets[mid][0] < target[0]:
                left = mid + 1
            else:
                right = mid - 1
        if not result and triplets:
            result.append(triplets.pop(0))
    return result