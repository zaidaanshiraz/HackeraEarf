//Ques->https://nados.io/question/ceil-and-floor-in-generic-tree?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  
  static class CFMover{
   static int ceil =Integer.MAX_VALUE;
   static int floor=Integer.MIN_VALUE;
  }
  
  public static void ceilAndFloor(Node node, int data,CFMover mover) {
    // Write your code here
if(node.data>data)
{
  if(node.data<mover.ceil)
  {
    mover.ceil=node.data;
  }
}
if(node.data<data)
{
  if(node.data>mover.floor)
  {
    mover.floor=node.data;
  }
}
for(Node child:node.children)
{
 ceilAndFloor(child,data,mover); 
}
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    CFMover mover=new CFMover();
    mover.ceil = Integer.MAX_VALUE;
    mover.floor = Integer.MIN_VALUE;
    
    ceilAndFloor(root, data,mover);
    System.out.println("CEIL = " + mover.ceil);
    System.out.println("FLOOR = " + mover.floor);
  }

}