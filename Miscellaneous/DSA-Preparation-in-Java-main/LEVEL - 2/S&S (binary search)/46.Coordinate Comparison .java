//https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1

class Solution {
    public List<String> topKFrequent(String[] s, int k) {
             HashMap<String,Integer>freq=new HashMap<>();
        for(int i=0;i<s.length;i++)
            freq.put(s[i],freq.getOrDefault(s[i],0)+1);
        TreeSet<String>[]buckets=new TreeSet[s.length+1];
        for(int i=0;i<buckets.length;i++)
            buckets[i]=new TreeSet<>();
        for(String word:freq.keySet())
        {
            int val=freq.get(word);
            buckets[val].add(word);
        }
       List<String> res=new ArrayList<>();
        for(int b=buckets.length-1;b>=0;b--)
        {
            for(String word:buckets[b])
            {
               
                    res.add(word);
                if(res.size()==k) return res;
            }
        }
        return res;     
    }
}
