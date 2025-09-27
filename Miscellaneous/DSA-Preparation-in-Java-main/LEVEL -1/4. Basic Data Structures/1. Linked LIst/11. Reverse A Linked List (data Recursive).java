//Ques->Function to Reverse a linked list

//Code->
public void swap(Node left,Node right)
{
    int temp=left.data;
    left.data=right.data;
    right.data=temp;
}
    public Node reverseDI(Node left,Node right,int counter) {
      // write your code here
      if(left==null)
      return right;
      right=reverseDI(left.next,right,counter+1);
      swap(left,right);
      right=right.next;
      return right;
     
    }
  }