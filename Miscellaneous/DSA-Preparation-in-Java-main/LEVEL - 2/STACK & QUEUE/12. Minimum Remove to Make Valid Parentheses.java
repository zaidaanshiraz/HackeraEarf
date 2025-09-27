//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

class Solution {
    public String minRemoveToMakeValid(String s) {
      Stack<Integer> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
               stk.push(i);
             else if(ch==')')
             {
                 if(stk.size()!=0)
                 {
                 int idx=stk.peek();
                 if(s.charAt(idx)=='(')
                 { stk.pop();
                  continue;
                 }
                 }
                 stk.push(i);
             }
        }
        System.out.println(stk);
        StringBuilder res=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(stk.size()!=0)
            {
            if(stk.peek()!=i)
                res.append(s.charAt(i));
            else
            {
                stk.pop();
                }
            }
            else
            {
                res.append(s.charAt(i));
            }
        }
      res=  res.reverse();
      return res.toString();  
    }
}