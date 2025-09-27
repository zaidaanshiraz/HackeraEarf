//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(freq.containsKey(nums[i]-k))
            count+=freq.get(nums[i]-k);
            if(freq.containsKey(nums[i]+k))
            count+=freq.get(nums[i]+k);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

return count;
    }
}