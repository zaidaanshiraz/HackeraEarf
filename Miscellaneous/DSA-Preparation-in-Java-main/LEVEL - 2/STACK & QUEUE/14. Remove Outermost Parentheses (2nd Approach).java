//https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String s) {
     int open=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
              
            char ch=s.charAt(i);
           
            if(ch=='(')
                open++;
            else
                open--;
            if(open==1&&ch=='(')
                continue;
            if(open!=0)
                res.append(ch);
            

        }
        return res.toString();
    }
}