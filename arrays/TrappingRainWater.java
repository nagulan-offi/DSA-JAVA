// ============================================
// LeetCode #42 - Trapping Rain Water
// Difficulty: Hard
// Topic: Arrays / Two Pointers / Dynamic Programming
// --------------------------------------------
// Approach: Precompute left max and right max arrays
//   - lmax[i] = maximum height from index 0 to i
//   - rmax[i] = maximum height from index i to n-1
//   - Water at index i = min(lmax[i], rmax[i]) - height[i]
//   - Sum all positive water levels
// --------------------------------------------
// Time Complexity : O(n) — three linear passes
// Space Complexity: O(n) — two extra arrays of size n
// ============================================

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // Left max array
        int[] lmax = new int[n];
        lmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }

        // Right max array
        int[] rmax = new int[n];
        rmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }

        // Water level and trapped water
        int trapped = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(lmax[i], rmax[i]);
            trapped += waterLevel - height[i];
        }

        return trapped;
    }
}
