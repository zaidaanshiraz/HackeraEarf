//https://leetcode.com/problems/decode-string/
class Solution {
    int idx=0;
    public String decodeString(String s) {
        StringBuilder res=new StringBuilder();
        
        while(idx<s.length())
        {
        char ch=s.charAt(idx);
        
        if(ch>='a'&&ch<='z')
        {
            res.append(ch);
            // idx++;
        }
            else if(ch>='0'&&ch<='9')
            {
                // char ch1=ch;
                int nums=0;
                while(s.charAt(idx)>='0'&&s.charAt(idx)<='9')
                {
                    
                    nums=nums*10+(s.charAt(idx)-'0');
                    idx++;
                    
                }
                 System.out.println(nums);
                // idx++;
                 System.out.println(res);
                String comeback=decodeString(s);
                System.out.println(comeback);
                for(int i=0;i<nums;i++)
                {
                    res.append(comeback);
                }
                continue;
                // idx++;
            }else if(ch==']')
            {
                idx++;
                return res.toString();
            }
            
            idx++;
            if(idx>=s.length())
            return res.toString();
        }
         return res.toString();
    }
}