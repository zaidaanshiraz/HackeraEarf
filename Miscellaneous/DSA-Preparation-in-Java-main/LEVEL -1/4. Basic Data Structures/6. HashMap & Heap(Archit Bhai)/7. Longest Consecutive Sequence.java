//https://leetcode.com/problems/longest-consecutive-sequence/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
         hm.put(nums[i],true);   
        }
        for(int a:hm.keySet())
        {
            if(hm.containsKey(a-1)==true)
             hm.put(a,false);                
        }
        int max=Integer.MIN_VALUE;
        for(int val:hm.keySet())
        {
            if(hm.get(val)==true)
            {
                int count=0;
                while(hm.containsKey(val)==true)
                {
            count++;
                    val++;
                }
                max=Math.max(max,count);
            }
        }
        if(max!=Integer.MIN_VALUE)
        return max;
        return 0;
    }
}