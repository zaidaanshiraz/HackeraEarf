// LC 53: https://leetcode.com/problems/maximum-subarray/

class DP {
    // KADANE'S Algorithm: Time - O(N), Space - O(1)
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] + currSum >= nums[i])
                currSum += nums[i];
            else
                currSum = nums[i];

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}