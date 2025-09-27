//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        Node zero=zeroHead,one=oneHead,two=twoHead;
        while(head!=null)
        {
            if(head.data==0)
            {
                zero.next=head;
                zero=head;
            }else if(head.data==1)
            {
                one.next=head;
                one=head;
            }else
            {
                two.next=head;
                two=head;
            }
            head=head.next;
        }
        two.next=null;
        one.next=twoHead.next;
        zero.next=oneHead.next;
        return zeroHead.next;
    }
}