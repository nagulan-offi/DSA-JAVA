// ============================================
// LeetCode #53 - Maximum Subarray
// Difficulty: Medium
// Topic: Arrays / Dynamic Programming
// --------------------------------------------
// Approach: Kadane's Algorithm
//   - Track current subarray sum (cur)
//   - If cur exceeds max, update max
//   - If cur drops below 0, reset to 0
//     (a negative prefix only hurts the next subarray)
// --------------------------------------------
// Time Complexity : O(n) — single pass
// Space Complexity: O(1) — no extra space
// ============================================

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (max < cur) max = cur;
            if (cur < 0) cur = 0;
        }
        return max;
    }
}
