//https://leetcode.com/problems/4sum-ii/

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int val:nums1)
        {
            for(int val2:nums2)
            {
                hm.put(val+val2,hm.getOrDefault(val+val2,0)+1);
            }
        }
        for(int val3:nums3)
        {
            for(int val4:nums4)
            {
                count+=hm.getOrDefault(-val3-val4,0);
            }
        }
        return count;
    }
}