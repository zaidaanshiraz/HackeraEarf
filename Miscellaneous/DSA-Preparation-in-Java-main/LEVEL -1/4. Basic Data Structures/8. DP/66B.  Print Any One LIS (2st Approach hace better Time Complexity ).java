class Solution2 {
    // Time - O(N * N), Space - O(N)
    public static void solution(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        int maxLIS = 0, lisidx = 0;

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1; // Length
            prev[i] = -1; // Empty Subset -> Current Element

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                    }
                }
            }

            if (dp[i] > maxLIS) {
                maxLIS = dp[i];
                lisidx = i;
            }

        }

        ArrayList<Integer> LIS = new ArrayList<>();

        while (lisidx != -1) {
            LIS.add(nums[lisidx]);
            lisidx = prev[lisidx];
        }

        Collections.reverse(LIS);
        System.out.println(LIS);
    }
}