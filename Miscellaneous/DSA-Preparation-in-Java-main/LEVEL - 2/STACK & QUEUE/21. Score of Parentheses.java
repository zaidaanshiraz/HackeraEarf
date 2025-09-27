//https://leetcode.com/problems/score-of-parentheses/

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        int var=0;
        // int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                stk.push(-1);
            else {
                if(stk.peek()!=-1){
              while(stk.peek()!=-1)
              {
                 int val=stk.pop();
                  var+=val;
              }
                    stk.pop();
                stk.push(2*var);
                var=0;
            }else
                {
                    stk.pop();
                    stk.push(1);
                }
        }
        }
var=0;
        while(stk.size()>0)
            var+=stk.pop();
        return var;
    }
}