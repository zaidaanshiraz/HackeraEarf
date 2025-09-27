//https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            int freq=hm.getOrDefault(s.charAt(i),0)+1;
            hm.put(s.charAt(i),freq);
            while(hm.get(s.charAt(i))>1)
            {
              int lfreq=hm.get(s.charAt(l));
                hm.put(s.charAt(l),lfreq-1);
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}