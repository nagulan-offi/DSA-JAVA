// ============================================
// LeetCode #169 - Majority Element
// Difficulty: Easy
// Topic: Arrays / Sorting
// --------------------------------------------
// Approach: Sorting
//   - Sort the array
//   - The majority element appears more than n/2 times
//   - After sorting, the element at index n/2 is always
//     the majority element because it occupies the middle
// --------------------------------------------
// Time Complexity : O(n log n) — sorting
// Space Complexity: O(1) — no extra space
// --------------------------------------------
// Follow-up: Boyer-Moore Voting Algorithm
//   - Solves in O(n) time and O(1) space
//   - Maintain a candidate and a count
//   - If count is 0, set current element as candidate
//   - If current element equals candidate, increment count
//   - Else decrement count
//   - The last standing candidate is the majority element
// ============================================

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}
