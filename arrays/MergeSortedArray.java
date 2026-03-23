// ============================================
// LeetCode #88 - Merge Sorted Array
// Difficulty: Easy
// Topic: Arrays / Two Pointers
// --------------------------------------------
// Approach: Three Pointer — Fill from the end
//   - Start from the last valid positions of
//     both arrays and the last position of nums1
//   - Compare nums1[i] and nums2[j] from the back
//   - Place the larger element at nums1[id]
//   - Move the respective pointer left
//   - If nums2 still has remaining elements,
//     copy them directly — nums1 elements are
//     already in their correct place
// --------------------------------------------
// Why fill from the end?
//   - Filling from the front would overwrite
//     existing elements in nums1
//   - Filling from the back uses the extra
//     space (zeros) without any conflict
// --------------------------------------------
// Time Complexity : O(m + n) — single pass
// Space Complexity: O(1) — in-place merge
// ============================================

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int id = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[id--] = nums1[i--];
            } else {
                nums1[id--] = nums2[j--];
            }
        }

        // Copy remaining elements of nums2 if any
        while (j >= 0) {
            nums1[id--] = nums2[j--];
        }
    }
}
