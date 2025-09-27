//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)//0 nodes or 1 nodes
            return false;
        if(head.next==head)
            return true; //Self Referential Node
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
             if(slow==fast) return true; //Cycle Detected
        }
       return false;//Cycle Not Detected
    }
}