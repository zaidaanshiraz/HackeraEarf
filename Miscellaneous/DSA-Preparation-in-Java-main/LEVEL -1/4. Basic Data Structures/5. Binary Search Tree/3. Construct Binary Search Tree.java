//Ques->construct binary search tree
// input ->
// 7
// 12 25 37 50 62 75 87

//Output
/*25 <- 50 -> 75
12 <- 25 -> 37
. <- 12 -> .
. <- 37 -> .
62 <- 75 -> 87
. <- 62 -> .
. <- 87 -> .*/

//Code
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

 }

public static Node construct(int []arr,int lo,int hi) {
  if(lo>hi)
  {
    return null;
  }
  int mid=(lo+hi)/2;
  Node node =new Node();
  node.data=arr[mid];
  node.left=construct(arr,lo,mid-1);
  node.right=construct(arr,mid+1,hi);

  return node;

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

  

  public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++)
arr[i]=scn.nextInt();

    Node root = construct(arr,0,arr.length-1);
    display(root);

   
  }

}
 