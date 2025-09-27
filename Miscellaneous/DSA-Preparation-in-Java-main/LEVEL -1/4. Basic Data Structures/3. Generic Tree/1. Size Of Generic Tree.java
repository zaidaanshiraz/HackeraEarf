//Ques->https://nados.io/question/size-of-generic-tree?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
   int data;
    ArrayList<Node> children = new ArrayList<>();
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
  

  public static void display(Node node) {
   if(node ==null)
   return ; //Tree is not present(No nodes)
  
  //Preorder (Meeting Expectation)
  System.out.print(node.data+" -> ");
  for(Node children:node.children)
  {
      System.out.print(children.data+", ");

  }
  System.out.println(".");
for(Node children:node.children)
{
  //Edge Preorder
  display(children);
  //Edge Postoder
}
  }

  public static Node construct(int[] arr) {
   Node root=null;
   Stack<Node> stk=new Stack<>();
   for(int i=0;i<arr.length;i++)
   {
     if(arr[i]==-1)// end of child marker node
{
stk.pop();//postoder(child-> parent)
}
else
{
  //1. Creation of Node
  Node curr=new Node(arr[i]);
  if(stk.size()==0)//1. current node is the root node(root has no parent)
  root=curr;
  else
  {//2. make current node as child of parent(stk.top())
    stk.peek().children.add(curr);
  }
  //3. Preorder (Push curr node in stack)
stk.push(curr);
}
   }
   return root;
  }

  public static int size(Node node){
    // write your code here
    int count=1;
    for(Node children:node.children)
    {
      count+=size(children);
    }
    return count;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    int sz = size(root);
    System.out.println(sz);
   //  display(root);
  }

}