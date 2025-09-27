//Ques->https://nados.io/question/size-sum-maximum-and-height-of-a-binary-tree?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

 }
  

  public static class Pair {
    Node node;
    int state;

   
  }

public static Node construct(Integer[] arr) {
Stack<Pair> stack=new Stack<>();
Node root=new Node();
root.data=arr[0];
Pair rootp=new Pair();
rootp.node=root;
rootp.state=1;
stack.push(rootp);
int idx=1;
while(stack.size()>0)
{
  Pair peekp=stack.peek();
  if(peekp.state==1)
  {
    //left
    if(arr[idx]!=null)
    {//tree mai jodo
      Node lc=new Node();
      lc.data=arr[idx];
      peekp.node.left=lc;

      //Stack mai daalo
      Pair lp=new Pair();
      lp.node=lc;
      lp.state=1;

stack.push(lp);

    }
    peekp.state++;
    idx++;
  }
  else  if(peekp.state==2)
  {
    //left
    if(arr[idx]!=null)
    {//tree mai jodo
      Node rc=new Node();
      rc.data=arr[idx];
      peekp.node.right=rc;

      //Stack mai daalo
      Pair rp=new Pair();
      rp.node=rc;
      rp.state=1;

stack.push(rp);

    }
    peekp.state++;
    idx++;
  }
  else if(peekp.state==3)
  {
    stack.pop();
  }
}  
return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int size(Node node) {
  //  write your code here
    if(node==null) return 0;
    int ls=size(node.left);
    int rs=size(node.right);

    return ls+rs+1;

    //one line code
    //return (node==null?0:size(node.left)+size(node.right)+1);
  }

  public static int sum(Node node) {
   // write your code here
    if(node ==null) return 0;
    int lsum=sum(node .left);
    int rsum=sum(node.right);
    return lsum+rsum+node.data;
//one line code
   // return (node==null?0:sum(node.left)+sum(node.right)+node.data);
  }

  public static int max(Node node) {
    // write your code here
      if(node ==null) return Integer.MIN_VALUE;
    int lmax=max(node .left);
    int rmax=max(node.right);
    
    return Math.max(Math.max(lmax,rmax),node.data);
//one line code

  // return (node==null?Integer.MIN_VALUE:(Math.max(Math.max(max(node.left),max(node.right)),node.data)));
  }

  public static int height(Node node) {
    // write your code here
      if(node ==null) return -1;
    int lheight=height(node .left);
    int rheight=height(node.right);

    return Math.max(lheight,rheight)+1;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
  //  display(root);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int ht = height(root);
    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(ht);
  }

}