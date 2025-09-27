//https://leetcode.com/problems/letter-tile-possibilities/
class Solution {
    public int count=0;
    public void findPossible(String output,HashMap<Character,Integer> hm,int idx,String tiles)
    {
        if(idx==tiles.length())
        {
            
            return;
        }

        for(char ch:hm.keySet())
        {
            int freq=hm.get(ch);
            if(freq>0)
            {
                count++;
                hm.put(ch,freq-1);
                findPossible(output+ch,hm,idx+1,tiles);
                hm.put(ch,freq);
            }
        }
    }
    public int numTilePossibilities(String tiles) {
      HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<tiles.length();i++)
        {
            char ch=tiles.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        findPossible("",hm,0,tiles);
        return count;
    }
}
