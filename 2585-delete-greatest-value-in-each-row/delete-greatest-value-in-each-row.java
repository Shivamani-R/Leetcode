class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        for (int col = n - 1; col >= 0; col--) {
            int maxVal = 0;
            for (int row = 0; row < m; row++) {
                maxVal = Math.max(maxVal, grid[row][col]);
            }
            result += maxVal;
        }

        return result;
    }
}