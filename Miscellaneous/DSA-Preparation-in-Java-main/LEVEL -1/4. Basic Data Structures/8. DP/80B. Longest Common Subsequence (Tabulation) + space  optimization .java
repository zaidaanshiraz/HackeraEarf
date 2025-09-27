//Ques->https://leetcode.com/problems/longest-common-subsequence/submissions/

class Solution {
     // Time - O(N * M), Space - O(M) 1D DP
    public int longestCommonSubsequence(String s1, String s2) {
        int[] next = new int[s2.length() + 1];

        for (int i = s1.length() - 1; i >= 0; i--) {
            int[] curr = new int[s2.length() + 1];

            for (int j = s2.length() - 1; j >= 0; j--) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);

                if (ch1 == ch2)
                    curr[j] = 1 + next[j + 1];

                else
                    curr[j] = Math.max(next[j], curr[j + 1]);
            }

            next = curr;
        }

        return next[0];
    }
}