// ============================================
// LeetCode #136 - Single Number
// Difficulty: Easy
// Topic: Arrays / Bit Manipulation
// --------------------------------------------
// Approach: XOR Bit Manipulation
//   - XOR of a number with itself is 0  → a ^ a = 0
//   - XOR of a number with 0 is itself  → a ^ 0 = a
//   - XOR is commutative and associative
//   - So XORing all elements cancels out
//     every duplicate, leaving only the
//     element that appears once
//
//   Example: [4, 1, 2, 1, 2]
//   0 ^ 4 = 4
//   4 ^ 1 = 5
//   5 ^ 2 = 7
//   7 ^ 1 = 6  (1 ^ 1 = 0, cancels out)
//   6 ^ 2 = 4  (2 ^ 2 = 0, cancels out)
//   Result = 4 ✓
// --------------------------------------------
// Time Complexity : O(n) — single pass
// Space Complexity: O(1) — one variable only
// --------------------------------------------
// Why this satisfies the constraints:
//   - Linear runtime → O(n) single loop
//   - Constant space → no HashMap, no array
// ============================================

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans = ans ^ i;
        }
        return ans;
    }
}
