class Solution:
    def verbal_arithmetic(self, sentences: List[str], returnSum: bool) -> int:
        words = {}
        for sentence in sentences:
            word = sentence[0].split()
            num = int(word[-1])
            key = ' '.join(word[:-2]) if returnSum else ''
            if key not in words:
                words[key] = []
            words[key].append(num)
        
        total_sum = 0
        for key, nums in words.items():
            mean = sum(nums) // len(nums)
            total_sum += (mean * (1 if returnSum else int(key.count(' ')))) 
        return total_sum