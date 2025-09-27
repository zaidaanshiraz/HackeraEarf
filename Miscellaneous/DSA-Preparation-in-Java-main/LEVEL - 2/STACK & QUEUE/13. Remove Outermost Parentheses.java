//https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                stk.push(i);
            else if(ch==')')
            {
               int idx= stk.pop();
                if(stk.size()==0)
                {
                    String res=s.substring(idx+1,i);
                    ans.append(res);
                }
            }
        }
        return ans.toString();
    }
}