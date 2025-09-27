//Code
import java.io.*;
import java.util.*;

public class Main {

  public static class MyPriorityQueue {
    ArrayList<Integer> data;

    public MyPriorityQueue(int []arr) {
      data = new ArrayList<>();
      for(int val:arr)
      data.add(val);

  for(int i=data.size()/2-1;i>=0;i--)
  {
    downheapify(i);
  }

    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapfiy(data.size()-1);
    }
    void upheapfiy(int i)
    {
      if(i==0)
      {
        return ;
      }
      int p=(i-1)/2;
      if(data.get(p)>data.get(i))
      {
        swap(p,i);
        upheapfiy(p);
      }
    }

    public int remove() {
      // write your code here
       if(data.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }
      swap(0,data.size()-1);
      int val=data.remove(data.size()-1);
      downheapify(0);
      return val;
    }
    void downheapify(int i)
    {
  int mini=i;
  int lchild=2*i+1;
  if(lchild<data.size()&& data.get(lchild)<data.get(mini))
  {
    mini=lchild;
  }
  int rchild=2*i+2;
  if(rchild<data.size()&&data.get(rchild)<data.get(mini))
{
  mini=rchild;
}  
if(mini!=i)
{
  swap(i,mini);
  downheapify(mini);
}
      }

    public int peek() {
      // write your code here
      if(data.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }
      return data.get(0);
          }

    public int size() {
      // write your code here
      return data.size();

    }
    void swap(int i,int j)
    {
      int ith=data.get(i);
      int jth=data.get(j);
      data.set(i,jth);
      data.set(j,ith);
    }
  }

  public static void main(String[] args) throws Exception {
  
  int []arr={10,20,30,40,50};
    MyPriorityQueue q=new MyPriorityQueue(arr);

System.out.println(q.peek());
System.out.println(q.peek());
System.out.println(q.remove());
System.out.println(q.peek());
System.out.println(q.remove());
System.out.println(q.peek());
System.out.println(q.remove());

System.out.println(q.peek());
System.out.println(q.remove());

System.out.println(q.peek());

    }
  }
