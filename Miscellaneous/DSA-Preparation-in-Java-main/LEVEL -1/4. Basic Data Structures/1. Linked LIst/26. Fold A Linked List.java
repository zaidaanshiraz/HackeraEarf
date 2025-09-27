//Ques->https://leetcode.com/problems/reorder-list/

//Code->
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode getMiddle(ListNode head)
    {
        ListNode slow=head,fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        
        if(fast==null)
        // {System.out.println(prev.val);
        {    return prev;
        }
        // System.out.println(slow.val);
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null,curr=head;
        while(curr!=null)
        {
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
  ListNode mid=getMiddle(head);
        ListNode second=reverse(mid.next);
         mid.next=null;
//         ListNode curr=head;
//      while(curr!=null)
//      { System.out.print(curr.val+" ");
//       curr=curr.next;}
//         System.out.println();
//  curr=second;
//         while(curr!=null)
//         {   System.out.print(curr.val+" ");
//          curr=curr.next;
//         }
//         System.out.println();
        
       
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(head!=null||second!=null)
        {
            if(head!=null)
            {
                tail.next=head;
                tail=head;
                head=head.next;
            }
            if(second!=null)
            {
                tail.next=second;
                tail=second;
                second=second.next;
            }
        }
        tail.next=null;
        head=dummy.next;
    }
}