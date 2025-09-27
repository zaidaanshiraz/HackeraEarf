def checkArrayFormation(arr, spec Seq):
    n = len(spec)
    i = 0
    for seq in spec:
        j = 0
        k = i
        while j < len(seq):
            while k < len(arr) and arr[k] != seq[j]:
                k += 1
            if k == len(arr):
                return False
            k += 1
            j += 1
        i = k
    return True