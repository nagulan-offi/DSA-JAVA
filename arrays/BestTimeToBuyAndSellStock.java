// ============================================
// LeetCode #121 - Best Time to Buy and Sell Stock
// Difficulty: Easy
// Topic: Arrays / Greedy / Sliding Window
// --------------------------------------------
// Approach: Greedy — Track minimum buy price
//   - Keep track of the minimum price seen so far (buy)
//   - At each day, if price is higher than buy price,
//     calculate profit and update maxProfit
//   - If price is lower than buy price, update buy price
//   - This ensures we always buy at the lowest point
//     seen before the current day
// --------------------------------------------
// Time Complexity : O(n) — single pass
// Space Complexity: O(1) — two variables only
// ============================================

class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {
                int pro = prices[i] - buy;
                maxPro = Math.max(maxPro, pro);
            } else {
                buy = prices[i];
            }
        }
        return maxPro;
    }
}
