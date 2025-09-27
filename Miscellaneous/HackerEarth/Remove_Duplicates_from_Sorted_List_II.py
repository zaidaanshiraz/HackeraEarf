# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        cur = head
        while cur and cur.next and cur.val == cur.next.val:
            cur = cur.next
        if not cur or not cur.next:
            return head
        head = cur.next
        cur = head
        while cur and cur.next:
            if cur.val != cur.next.val:
                cur = cur.next
            elif cur.next.next and cur.val == cur.next.next.val:
                while cur.next and cur.next.val == cur.val:
                    cur.next = cur.next.next
                break
            else:
                cur.next = cur.next.next
                break
        return head