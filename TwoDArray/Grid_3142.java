package Leetcode.TwoDArray;

public class Grid_3142 {

    public static boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;        // Number of rows
        int n = grid[0].length;     // Number of columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check the cell below (if it exists)
                if (i < m-1 && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
                // Check the cell to the right (if it exists)
                if (j < n - 1 && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    
    }
    public static void main(String[] args) {
        int[][] grid = {{1,4},
                        {6,6}};
        System.out.println(satisfiesConditions(grid));
    }
}
