//Ques->https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/linked-list/unfold-of-linkedlist/ojquestion

//Code->
import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode head)
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
    public static void unfold(ListNode head) {
        ListNode firstHead=new ListNode(-1);
        ListNode secondHead=new ListNode(-1);
        ListNode first=firstHead,second=secondHead;
        while(head!=null)
    {
        first.next=head;
        first=head;
        head=head.next;
        if(head!=null)
        {
            second.next=head;
            second=head;
            head=head.next;
        }
    }
    first.next=null;
    second.next=null;
    first.next=reverse(secondHead.next);
    head=first.next;

    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}