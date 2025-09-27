//https://leetcode.com/problems/remove-invalid-parentheses/

class Solution {
 public static   HashSet<String> set;
    public static int[] findCloseandOpen(String s)
    {
        
int open=0,close=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                open++;
            else if(ch==')')
            {
                if(open>0)
                    open--;
                else close++;
            }
        }
        return new int[]{open,close};
    }
    public List<String> removeInvalidParentheses(String s) {
        int []arr=findCloseandOpen(s);
        int open=arr[0];
        int close=arr[1];
        int ub=0;
        set=new HashSet<>();
        findValidString(s,open,close,ub,"",0);
        System.out.println(set);
        List<String> obj=new ArrayList<>();
        for(String str:set)
            obj.add(str);
        return obj;
    }
    // int idx=0;
    public static void findValidString(String s,int open,int close,int ub,String output,int idx)
    {
        if(idx==s.length())
        {
            if(open==0&&close==0&&ub==0)
            set.add(output);
            return ;
}
char ch=s.charAt(idx);
        if(ch==')')
        {
            if(ub>0)
              findValidString(s,open,close,ub-1,output+ch,idx+1);
            if(close>0)
                 findValidString(s,open,close-1,ub,output,idx+1); 
        }else if(ch=='(')
        {
             findValidString(s,open,close,ub+1,output+ch,idx+1);
            if(open>0)
                  findValidString(s,open-1,close,ub,output,idx+1);
        }
        else
            findValidString(s,open,close,ub,output+ch,idx+1);
    }
}