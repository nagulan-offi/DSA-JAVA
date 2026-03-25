// ============================================
// LeetCode #73 - Set Matrix Zeroes
// Difficulty: Medium
// Topic: Arrays / Matrix
// --------------------------------------------
// Approach: In-place marking using first row & column
//   - Use first row and first column as markers
//   - If matrix[i][j] == 0 → mark:
//       matrix[i][0] = 0 and matrix[0][j] = 0
//   - Track separately if first row or first column
//     originally had any zero using two flags
//   - Traverse matrix again and set cells to 0
//     based on markers
//   - Finally, update first row and column if needed
// --------------------------------------------
// Time Complexity : O(m * n) — traverse matrix twice
// Space Complexity: O(1) — in-place solution
// ============================================

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Update cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Update first row
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Update first column
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
