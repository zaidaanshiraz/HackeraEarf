//https://leetcode.com/problems/sort-characters-by-frequency/
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        } //O(N)
        System.out.println(freq);
        HashMap<Integer,ArrayList<Character>> obj=new HashMap<>();
for(char ch:freq.keySet())
{
   int val=freq.get(ch);
    if(obj.containsKey(val)==false)
    {
        obj.put(val,new ArrayList<>());
    }
    obj.get(val).add(ch);
}//O(26)
        System.out.println(obj);
        StringBuilder ans=new StringBuilder();
for(int i=s.length();i>=0;i--)
{
    if(obj.containsKey(i)==true)
    {
        ArrayList<Character> curr=obj.get(i);
        for(int k=0;k<curr.size();k++)
        {
            char ch1=curr.get(k);
            for(int j=0;j<i;j++)
                ans.append(ch1);
        }
    }
}
        return ans.toString();
    }
}