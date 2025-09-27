/*Ques->Take an input N, the size of list.
Take N more inputs and store that in an list.

Given a singly linked list, find middle of the linked list. For example,
if given linked list is 1->2->3->4->5 then output should be 3.

If there are even nodes, then there would be two middle nodes, we need to print
second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.




Example(To be used only for expected output):
Input:
5
1 2 3 4 5
Output:
3
Input Format

Integer representing N
Integer representing N numbers.
Constraints

0 <= N <= 10^9
-10^9 <= Linkedlist[i] <= 10^9
Output Format

print the Linkedlist.

Sample Input 0

5
1 2 3 4 5
Sample Output 0

3*/

//Code->
import java.io.*;
import java.util.*;

public class Solution {
  public static class Node{
    int data;
    Node next;
  }
  public static class LinkedList{
    
Node head;
    Node tail;
    int size=0;
    void addLast(int val)
    {
      Node temp=new Node();
      temp.data=val;
if(head==null&&tail==null)
{
  head=tail=temp;
}
    else
    {
      tail.next=temp;
      tail=temp;
    }
    }
    void display(Node head)
    {
      Node curr=head;
      while(curr!=null)
      {
System.out.print(curr.data+" ");
      curr=curr.next;
      }
    }
    Node middle(Node head)
    {
      Node slow=head,fast=head,prev=null;
      while(fast!=null &&fast.next!=null)
      {
prev=slow;
        slow=slow.next;
        fast=fast.next.next;
      }
      
      return slow;
      
}
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      LinkedList list =new LinkedList();
      int n=scn.nextInt();
      for(int i=0;i<n;i++)
      {
        int val=scn.nextInt();
        list.addLast(val);
      }
      // list.display(list.head);
      Node ans=list.middle(list.head);
      System.out.println(ans.data);
    }
}