//Ques->https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/

class Solution {
      // Greedy Approach without Extra Space
    // Time - O(N), Space - O(1)
    public int maxProfit(int[] prices) {
        int buying = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buying < prices[i]) {
                profit += prices[i] - buying;
            }

            buying = prices[i];
        }

        return profit;
    }
}
