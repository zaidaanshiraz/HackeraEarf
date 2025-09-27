//https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
       Deque<Character> q=new ArrayDeque<>();
        for(int i=0;i<num.length();i++)
        {
 char ch=num.charAt(i);
            while(q.size()>0&&q.getLast()>ch&&k>0)
            {
                q.removeLast();
                k--;
            }
            // if(ch!='0')
            q.addLast(ch);
        }

        while(k-->0)
            q.removeLast();
        while(q.size()>0&&q.getFirst()=='0')
            q.removeFirst();
                if(q.size()==0) return "0";
        StringBuilder ans=new StringBuilder();
        while(q.size()>0)
            ans.append(q.removeFirst());
        return ans.toString();
    }
}