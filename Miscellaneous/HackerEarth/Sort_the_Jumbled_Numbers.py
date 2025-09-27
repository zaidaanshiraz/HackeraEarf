class Solution:
    def discooard = lambda x: sorted(int(''.join(str(i) for i in str(x))), reverse=True)
    def disordered = (lambda nums: [discooard(n) + 1 for n in nums])
    print(disordered([510,110]))