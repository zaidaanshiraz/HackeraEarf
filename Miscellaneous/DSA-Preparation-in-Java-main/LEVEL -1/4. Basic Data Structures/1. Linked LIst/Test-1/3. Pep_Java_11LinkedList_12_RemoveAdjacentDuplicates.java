/*Ques->Take an input N, the size of list.
Take N more inputs and store that in an list.

Write a function which remove adjacent duplicate nodes from the list

print the list.

Example(To be used only for expected output):
Input:
10
1 2 3 0 2 2 4 5 6 6
Output:
1 2 3 0 2 4 5 6
Input Format

Integer representing N
Integer representing N numbers.
Constraints

0 <= N <= 10^9
-10^9 <= Linkedlist[i] <= 10^9
Output Format

print the Linkedlist.*/

//Code->
import java.io.*;
import java.util.*;

public class Solution {
public static class Node{
  int data;
  Node next;
  
}
  public static class  LinkedList{
    Node head;
    Node tail;
    Node size;
    void addLast(int val)
    {
      Node temp=new Node();
      temp.data=val;
      if(head==null&&tail==null)
      {
        head=temp;
        tail=temp;
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
      LinkedList list=new LinkedList();
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      for(int i=0;i<n;i++)
      {
int val=scn.nextInt();
        list.addLast(val);
      }
      Node dummy=new Node();
      dummy.data=-1;
      Node tail=dummy;
      while(list.head.next!=null&&list.head!=null)
      {
        if(list.head.data!=list.head.next.data)
        {
          tail.next=list.head;
          tail=list.head;
        }
        list.head=list.head.next;
      }
      if(tail.next!=null)
      {
        tail.next.next=null;
      }
      list.display(dummy.next);
    }
  
}