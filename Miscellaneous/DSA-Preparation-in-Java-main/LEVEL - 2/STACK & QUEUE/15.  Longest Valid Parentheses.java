// https://leetcode.com/problems/longest-valid-parentheses/

class Solution {
    public int longestValidParentheses(String s) {
            Stack<Integer> stk=new Stack<>();
        // StringBuilder ans=new StringBuilder();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                stk.push(i);
            else if(ch==')')
            {
     if(stk.size()>0&&s.charAt(stk.peek())=='(')
     {
         stk.pop();
     }else
         stk.push(i);

            }
                                     int j=(stk.size()==0)?-1:stk.peek();
            max=Math.max(max,i-j);   

        }
        return max;
    }
}

