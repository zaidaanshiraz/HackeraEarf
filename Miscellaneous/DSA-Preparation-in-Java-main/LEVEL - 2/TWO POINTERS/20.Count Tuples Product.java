//https://leetcode.com/problems/tuple-with-same-product/

class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int prod=nums[i]*nums[j];
            hm.put(prod,hm.getOrDefault(prod,0)+1);
                
            }
        }
        int count=0;
        for(Integer freq:hm.keySet())
        {
            int val=hm.get(freq);
            count+=(val*(val-1))/2;
        }
        return 8*count;
    }
}