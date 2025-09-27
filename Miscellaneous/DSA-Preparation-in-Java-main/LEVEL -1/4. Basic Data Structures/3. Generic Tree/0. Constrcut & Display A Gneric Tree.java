//Ques
//Input Output 
// 24
//10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
//Gneric Tree 
//         10
//      /  |    \ 
//    20  30     40
//   /|   / |  \  \
// 50 60 70 80 90 100
//          /\
//       110 120

//Output
/*10-> 20,30,40,.
20-> 50,60,.
50-> .
60-> .
30-> 70,80,90,.
70-> .
80-> 110,120,.
110-> .
120-> .
90-> .
40-> 100,.
100-> .*/

//Code
import java.io.*;
import java.util.*;

public class Main{
  private static class Node{
    int data;
    ArrayList<Node> children ;
    Node(){
      this.data=0;
this.children=new ArrayList<>(); 
   }
    Node(int data)
 {
      this.data=data;
this.children=new ArrayList<>(); 
}
  }
public static Node construct(int []arr)
{
Node root=null;
Stack<Node> stk=new Stack<>();
for(int i=0;i<arr.length;i++)
{
  if(arr[i]==-1)
  {
stk.pop();
  }
  else
  {
    Node curr=new Node(arr[i]);
    if(stk.size()==0)
    {
root=curr;
    }
    else
    {
stk.peek().children.add(curr);
    }
    stk.push(curr);
  }
}
return root;
}
public static void display(Node node)
{
System.out.print(node.data+"-> ");
for(Node child:node.children)
{
  System.out.print(child.data+",");
}
System.out.println(".");
for(Node child:node.children)
{
  
  // System.out.println();
  display(child);
}  
}
  

  public static void main(String[] args) throws Exception {
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  int []arr=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=scn.nextInt();
  }
  Node root=construct(arr);
  display(root);
  
}

 
}
 

