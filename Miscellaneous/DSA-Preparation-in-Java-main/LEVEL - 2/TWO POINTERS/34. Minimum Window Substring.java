//https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
     HashMap<Character,Integer> req=new HashMap<>();
    
for(int i=0;i<t.length();i++)
{
    req.put(t.charAt(i),req.getOrDefault(t.charAt(i),0)+1);
}
        int l=0;
        int len=Integer.MAX_VALUE;
    HashMap<Character,Integer> curr=new HashMap<>();
        int matchCount=0;
        int idx=0;
        for(int r=0;r<s.length();r++)
        {
            curr.put(s.charAt(r),curr.getOrDefault(s.charAt(r),0)+1);
            int freq=curr.get(s.charAt(r));
            if(freq==req.getOrDefault(s.charAt(r),0))
                matchCount++;
            while(matchCount>=req.size())
            {
                if(matchCount>=req.size()&&r-l<len)
                {
                    idx=l;
                    len=r-l+1;
                }
                int lfreq=curr.get(s.charAt(l));
                curr.put(s.charAt(l),lfreq-1);
                if(lfreq==req.getOrDefault(s.charAt(l),0))
                    matchCount--;
                l++;
            }
        }
        if(len==Integer.MAX_VALUE)
            return "";
        return s.substring(idx,idx+len);
    }
}