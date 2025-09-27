//https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] s, int k) {
          HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<s.length;i++)
            freq.put(s[i],freq.getOrDefault(s[i],0)+1);
        ArrayList<Integer>[]buckets=new ArrayList[s.length+1];
        for(int i=0;i<buckets.length;i++)
            buckets[i]=new ArrayList<>();
        for(Integer ch:freq.keySet())
        {
            int val=freq.get(ch);
            buckets[val].add(ch);
        }
        int []res=new int[k];
        int idx=0;
        for(int b=buckets.length-1;b>=0;b--)
        {
            for(Integer ch:buckets[b])
            {
               
                    res[idx++]=ch;
                if(idx==k) return res;
            }
        }
        return res;   
    }
}