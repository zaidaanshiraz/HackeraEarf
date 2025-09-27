/*Ques->Take an input N, the size of list.
Take N more inputs and store that in an list.

Write a function which Arrange elements in a Linked List such that all even
numbers are placed after odd numbers.

print the list.

Example(To be used only for expected output):
Input:
10
1 2 3 1 2 2 4 5 6 6
Output:
1 3 1 5 2 2 2 4 6 6
Input Format

Integer representing N
Integer representing N numbers.
Constraints

0 <= N <= 10^9
-10^9 <= Linkedlist[i] <= 10^9
Output Format

print the Linkedlist.

Sample Input 0

10
1 2 3 1 2 2 4 5 6 6
Sample Output 0

1 3 1 5 2 2 2 4 6 6
*/

//Code->
import java.io.*;
import java.util.*;

public class Solution {

  public static class Node {
int data;
  Node next;}
  public static class LinkedList{
    Node head;
    Node tail;
    Node size;
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
  }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      LinkedList list=new LinkedList();
      
      for(int i=0;i<n;i++)
      {
        int val=scn.nextInt();
        list.addLast(val);
      }
      // list.display(list.head);
      LinkedList oddList =new LinkedList();
     oddList.addLast(-1);
       Node odd=oddList.head;
      LinkedList evenList =new LinkedList();
            evenList.addLast(-1);
      Node even=evenList.head;
 while(list.head!=null)
      {
if(list.head.data%2==1)
{
  odd.next=list.head;
  odd=list.head;
  list.head=list.head.next;
}
else
{
  if(list.head!=null)
  {
    even.next=list.head;
    even=list.head;
    list.head=list.head.next;
  }
}
        
      }
      
      even.next=null;
      odd.next=null;
     
    odd.next=evenList.head.next;
       evenList.head.next=null;
      list.display(oddList.head.next);
    }
}