//https://leetcode.com/problems/basic-calculator/
class Solution {
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
public static String refine(String exp)
{
    StringBuilder res=new StringBuilder();
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(ch==' ')
            continue;
        else if(ch=='+')
        {
          if(res.length()==0||res.charAt(res.length()-1)=='(')
          {
            res.append("0+");
              continue;
          }else if(res.charAt(res.length()-1)=='+'||(res.charAt(res.length()-1)=='-'))
              continue;
           else res.append(ch); 
                
        }else if(ch=='-')
        {
                      if(res.length()==0||res.charAt(res.length()-1)=='(')
          {
            res.append("0-");
              continue;
          }else if(res.charAt(res.length()-1)=='+')
                      {
                        res.deleteCharAt(res.length()-1);
                          res.append("-");
                          continue;
                      }else if((res.charAt(res.length()-1)=='-'))
                          {
                        res.deleteCharAt(res.length()-1);
                          res.append("+");
                          continue;
                      }
             else res.append(ch); 
        }
      else  res.append(ch);
    }
    return res.toString();
}
    public int calculate(String s) {
String exp=s;
        
          exp = refine(exp);
        System.out.println(exp);
        
    Stack<Character> operator=new Stack<>();
  Stack<Integer>operand=new Stack<>();

   for(int i=0;i<exp.length();i++)
   {
       char ch=exp.charAt(i);
       if(ch>='0'&&ch<='9')
       {
              int num=0;
           while(i<exp.length()&&(exp.charAt(i)>='0'&&exp.charAt(i)<='9'))
           {
               num=num*10+(exp.charAt(i)-'0');
                   i++;
           }
           operand.push(num);
           i--;
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
return operand.peek();
 }

}