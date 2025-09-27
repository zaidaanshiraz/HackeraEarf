//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
class Solution {
    public int minInsertions(String s) {
        int open=0;
        int add=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                open++;
            else if(ch==')')
            {
if(open>0) open--;
                else add++; //add one open character
                if(i+1<s.length()&&s.charAt(i+1)==')')
                    i++;
                else 
                    add++; //add one close character
                }
            }
        return ((2*open)+add);
        }
        
    
}