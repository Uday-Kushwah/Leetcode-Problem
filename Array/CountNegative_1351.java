package Leetcode.Array;

public class CountNegative_1351 {

    // Time Complexity : O(n^2)
    // public static int countNegatives(int[][] grid) {
    //     int count = 0;
    //     for (int i = 0; i < grid.length; i++) {
    //         for (int j = 0; j < grid[0].length; j++) {
    //             if(grid[i][j] < 0) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    //Time Complexity : O(m * log(n))
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            int lo = 0;
            int firstNegativeIndex = n;  // Default to n if no negative number is found
            int hi = n-1;
            while (lo <= hi) {
                int mid = hi+(lo-hi)/2;
                if(grid[i][mid] < 0) {
                    firstNegativeIndex = mid;
                    hi = mid - 1;    // Look for earlier negatives on the left side
                } else {
                    lo = mid+1;      // Look for negatives on the right side
                }
            }
            
            count += (n-firstNegativeIndex);
            
        }
        return count;

    }
    public static void main(String[] args) {
        // int[][] grid = {{4,3,-2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid = {{3,2},{1,0}};
        System.out.println(countNegatives(grid));
        // countNegatives(grid);
    }
}
