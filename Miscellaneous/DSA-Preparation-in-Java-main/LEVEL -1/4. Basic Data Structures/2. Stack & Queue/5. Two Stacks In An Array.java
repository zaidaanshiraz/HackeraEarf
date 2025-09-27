//Ques->https://nados.io/question/two-stacks-in-an-array

//Code
import java.io.*;
import java.util.*;

public class Main {

  public static class TwoStack {
    int[] data;
    int top1;
    int top2;

    public TwoStack(int cap) {
      // write your code here
      data=new int[cap];
      top1=-1;
      top2=cap;
    }

    int size1() {
      // write your code here
      return top1+1;
    }

    int size2() {
      // write your code here
      return data.length-top2;

    }

    void push1(int val) {
    // write your code here
    if(size1()+size2()==data.length)
     {
       System.out.println("Stack overflow");
       return ;
     }
     top1++;
     data[top1]=val;
    }

    void push2(int val) {
     // write your code here
     if(size2()+size1()==data.length)
     {
       System.out.println("Stack overflow");
       return ;
     }
     top2--;
     data[top2]=val;

    }

    int pop1() {
 // write your code here
   if(size1()==0)
     {
       System.out.println("Stack underflow");
       return -1;
     }
     int val=data[top1];
     top1--;
     return val;
    }

    int pop2() {
    // write your code here
    if(size2()==0)
     {
       System.out.println("Stack underflow");
       return -1;
     }
     int val=data[top2];
     top2++;
     return val;
    }

    int top1() {
    // write your code here
    if(top1==-1)
    {
      System.out.println("Stack underflow");
       return -1;
    }
    return data[top1];
    }

    int top2() {
     // write your code here
      if(top2==data.length)
    {
      System.out.println("Stack underflow");
       return -1;
    }
     return data[top2];
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    TwoStack st = new TwoStack(n);

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push1")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push1(val);
      } else if (str.startsWith("pop1")) {
        int val = st.pop1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top1")) {
        int val = st.top1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size1")) {
        System.out.println(st.size1());
      } else if (str.startsWith("push2")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push2(val);
      } else if (str.startsWith("pop2")) {
        int val = st.pop2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top2")) {
        int val = st.top2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size2")) {
        System.out.println(st.size2());
      }
      str = br.readLine();
    }
  }
}