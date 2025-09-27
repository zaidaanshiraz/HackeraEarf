/*Ques->Take an input N, the size of list.
Take N more inputs and store that in an list.

Write a Recursive function which Insertion Sort the list but don't allow to use
any kind Iterative.

print the list.

Example(To be used only for expected output):
Input:
4
1 2 3 0
Output:
0 1 2 3
Input Format

Integer representing N
Integer representing N numbers.
Constraints

0 <= N <= 10^9
-10^9 <= Linkedlist[i] <= 10^9
Output Format

print Output.

Sample Input 0

4
1 2 3 0
Sample Output 0

0 1 2 3 */

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
    void swap(Node head, Node tail)
    {
      int temp=head.data;
      head.data=tail.data;
      tail.data=temp;
    }
    void sort(Node head,Node tail)
    {
      if(head==tail)
        return ;
      sort(head.next,tail);
        if(head.data>head.next.data)
          swap(head,head.next);
    }
    
    void display(Node head,Node tail)
    {
      Node curr=head;
      while(curr!=tail)
      {
        System.out.print(curr.data+" ");
        curr=curr.next;
      }
      System.out.print(curr.data);
    }
    void sortlist(Node head,Node tail)
    {
      if(head==tail)
        return ;
      Node curr=head;
      Node prev=head;
      while(curr!=tail)
      {
        prev=curr;
    curr=curr.next;
          }
      sortlist(head,prev);
     
      // System.out.println();
      sort(head,prev);
     // /  display(head,prev);
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
      Node temp=null;
       list.sortlist(list.head,list.tail.next);
       list.display(list.head,list.tail);
    }
}