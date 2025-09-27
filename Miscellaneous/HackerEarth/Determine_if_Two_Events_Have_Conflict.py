class Solution:
    def haveConflict(self, event1: List[int], event2: List[int]) -> bool:
        return (event1[0] <= event2[1] and event1[1] >= event2[0])