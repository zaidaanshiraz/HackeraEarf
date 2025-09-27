//Ques->https://nados.io/question/infix-evaluation

//Code
import java.io.*;
import java.util.*;

public class Main{
  
public static int precendence(char op)
{
    if(op=='/'||op=='*')return 2;
    if(op=='+'||op=='-')return 1;
    return 0;
}
public static int performOp(int a,char op,int b)
{
    if(op=='+')
    {
        return a+b;
    }else if(op=='-')
    {
        return a-b;    
        
    }
    else if(op=='*')
    {
        return a*b;
    }
    else{
        return a/b;
    }
}
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Character> operator=new Stack<>();
  Stack<Integer>operand=new Stack<>();
    String exp = br.readLine();
   for(int i=0;i<exp.length();i++)
   {
       char ch=exp.charAt(i);
       if(ch>='0'&&ch<='9')
       {
           operand.push(ch-'0');
       }
       else if(ch=='(')
       {
           operator.push(ch);
       }
       else if(ch==')')
       {
           while(operator.peek()!='(')
           {
               int b=operand.pop();
               int a=operand.pop();
               char op=operator.pop();
               operand.push(performOp(a,op,b));
           }
           operator.pop();
       }
       else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
       {
           while(operator.size()>0&&operator.peek()!='('&&precendence(operator.peek())>=precendence(ch))
           {
               int b=operand.pop();
               int a=operand.pop();
               char op=operator.pop();
               operand.push(performOp(a,op,b));
           }
           operator.push(ch);
       }
   }
   while(operator.size()>0)
   {
       int val2=operand.pop();
       int val1=operand.pop();
       char op=operator.pop();
       int res=performOp(val1,op,val2);
       operand.push(res);
   }
    System.out.println(operand.peek());
 }
}