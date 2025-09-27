//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

class Solution {
    public int longestkSubstr(String s, int k) {
	  HashMap<Character,Integer>hm=new HashMap<>();
        int l=0;
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            int freq=hm.getOrDefault(s.charAt(i),0)+1;
            hm.put(s.charAt(i),freq);
            while(hm.size()>k)
            {
              int lfreq=hm.get(s.charAt(l));
                hm.put(s.charAt(l),lfreq-1);
                if(lfreq-1==0)
                hm.remove(s.charAt(l));
                l++;
            }
            if(hm.size()==k)
            max=Math.max(max,i-l+1);
        }
        return max;	
    }
}