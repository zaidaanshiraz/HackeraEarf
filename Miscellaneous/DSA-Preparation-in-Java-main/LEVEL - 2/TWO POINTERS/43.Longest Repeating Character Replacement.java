//https://leetcode.com/problems/longest-repeating-character-replacement/

class Solution {
    public int helper(String s,int k,char ch)
    {
        int l=0;
        int max=0;
        int rep=0;
        for(int r=0;r<s.length();r++)
        {
            if(s.charAt(r)!=ch)
                rep++;
            while(rep>k)
            {
                if(s.charAt(l)!=ch)
                    rep--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
     int ans=0;
        for(int i=0;i<26;i++)
        {
            ans=Math.max(ans,helper(s,k,(char)(i+'A')));
        }
        return ans;
    }
}