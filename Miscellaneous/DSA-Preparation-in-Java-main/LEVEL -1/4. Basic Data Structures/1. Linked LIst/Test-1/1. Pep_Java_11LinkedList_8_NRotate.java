/*Ques->Take an input N, the size of list.
Take N more inputs and store that in an list.

Append the last n elements of a linked list to the front.
e.g. for 1→ 2→ 3 → 4 → 5 → 6 and n = 2 return 5→ 6→ 1→ 2→ 3 → 4

print the list.


Example(To be used only for expected output):
Input:
7 3
3 4 5 2 6 1 9
Output:
6 1 9 3 4 5 2
Input Format

Integer representing N
Integer representing N numbers.
Constraints

-10 ^ 9 <= N,n <= 10 ^ 9

Output Format

print Output.

Sample Input 0

7 3
3 4 5 2 6 1 9
Sample Output 0

6 1 9 3 4 5 2
*/

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
    int size;
    void addLast(int val)
    {
      Node temp=new Node();
      temp.data=val;
if(head==null && tail==null)
{
  head=temp;
  tail=temp;
}else
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
    Node knodeFromEnd(Node head,int limit)
    {
      Node curr=head;
      for(int i=0;i<limit-1;i++)
      {
        curr=curr.next;
      }
      return curr;
    }
    Node reverse(Node head)
    {
      Node prev=null,curr=head;
      while(curr!=null)
      {
        Node ahead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ahead;
      }
      return prev;
    }
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int k=scn.nextInt();
      if(k>=n)
      {
        k=k%n;
      }
      if(k<0)
      {
        k=k+n;
      }
      LinkedList list=new LinkedList();
      for(int i=0;i<n;i++)
      {
        int val=scn.nextInt();
        list.addLast(val);
      }
      Node first=list.head;
      Node secondPrev=list.knodeFromEnd(list.head,n-k);
      // System.out.println("val "+secondPrev.data);
      Node second=list.reverse(secondPrev.next);
      // list.display(second);
      secondPrev.next=null;
      first=list.reverse(first);
      // System.out.println();
      // list.display(first);
      // System.out.println(list.head.data);
      list.head.next=second;
      first=list.reverse(first);
      list.display(first);
      // first=list.reverse(first);
      // secondPrev.next=null;
      //  list.display(second);
       // list.display(first);
      // secondPrev.next=second;
      // list.display(first);
    }
}