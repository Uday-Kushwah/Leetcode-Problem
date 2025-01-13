//https://leetcode.com/problems/convert-1d-array-into-2d-array/description/

package Leetcode.TwoDArray;

public class One_Two_2022 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) {
            return new int[0][0];
        }
        int[][] ans = new int[m][n];
        int k = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = original[k];
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m = 3;
        int n = 2;
        int[][] ans = construct2DArray(original, m, n);
         
        if (ans.length == 0) {
            System.out.println("Cannot reshape the array into the specified dimensions.");
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
