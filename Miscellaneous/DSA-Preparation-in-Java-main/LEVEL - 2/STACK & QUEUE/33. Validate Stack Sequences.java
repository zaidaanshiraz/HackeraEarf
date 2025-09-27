//https://leetcode.com/problems/validate-stack-sequences/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int push=0;
        Stack<Integer> stk=new Stack<>();
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<popped.length;i++)
        {
            if(hm.contains(popped[i])==true)
            {
                if(stk.size()==0||popped[i]!=stk.peek())
                    return false;
                else 
                    stk.pop();
                    
            }
            else
            {
                while(push<pushed.length&&pushed[push]!=popped[i])
                {
                stk.push(pushed[push]);
                    hm.add(pushed[push]);
                    push++;
                }
                push++;
            }
        }
        if(stk.size()==0)
            return true;
        return false;
    }
}