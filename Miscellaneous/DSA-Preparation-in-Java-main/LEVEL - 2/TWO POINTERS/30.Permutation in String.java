//https://leetcode.com/problems/permutation-in-string/
class Solution {
    public boolean isEqual(int []freqs1,int []freqs2)
    {
        for(int i=0;i<freqs1.length;i++)
        {
            if(freqs1[i]!=freqs2[i])
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
       int []s1freq=new int[26];
        for(int i=0;i<s1.length();i++)
            s1freq[s1.charAt(i)-'a']++;
        int []s2freq=new int[26];
        for(int i=0;i<s2.length();i++)
        {
            if(i<s1.length())
            {
                s2freq[s2.charAt(i)-'a']++;

            }else if(i>=s1.length()){
           s2freq[s2.charAt(i-s1.length())-'a']--;
            s2freq[s2.charAt(i)-'a']++;
            }
            if(isEqual(s1freq,s2freq)==true)
                return true;
        }
        return false;
    }
}