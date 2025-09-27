//Ques->https://leetcode.com/problems/longest-increasing-subsequence/submissions/

class Solution {
   // Time - O(N * N), Space - O(N)
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLIS = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1; // If Prev Does not Exist, then current element can have yes

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }
}