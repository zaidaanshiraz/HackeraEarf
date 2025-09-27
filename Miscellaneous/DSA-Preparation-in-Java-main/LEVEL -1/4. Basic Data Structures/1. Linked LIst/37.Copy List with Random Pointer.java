//https://leetcode.com/problems/copy-list-with-random-pointer/
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
  Node original=head;

        while(original!=null)
        {
            // Insert duplicates Nodes in Between
            Node duplicate=new Node(original.val);
            duplicate.next=original.next;
            original.next=duplicate;
            original=duplicate.next;
        }
        original=head;
        //Duplicate's Random Node Updation
        while(original!=null)
        {
            Node randomNode=original.random;
            if(original.random!=null)
                randomNode=randomNode.next;
                original.next.random=randomNode;
                original=original.next.next;
            
        }
                if(head==null||head.next==null)
            return original;
        original=head;
        Node copyHead=head.next;
            //Separating the original from  duplicate
        while(original!=null)
        {
            Node duplicate=original.next;
            original.next=original.next.next;
            if(duplicate.next!=null)
                duplicate.next=duplicate.next.next;
            original=original.next;
        }
        return copyHead;
    }
}