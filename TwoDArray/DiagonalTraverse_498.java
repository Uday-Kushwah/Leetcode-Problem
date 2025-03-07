package Leetcode.TwoDArray;

public class DiagonalTraverse_498 {
    public static int[] Traverse(int[][] arr) {
        int row = 0;
        int col = 0;
        int m = arr.length;
        int n = arr[0].length;
        int idx = 0;
        int ans[] = new int[m*n];
        boolean up = true;
        while(row < m && col < n) {
            if(up){
                while(row > 0 && col < n-1) {
                    ans[idx++] = arr[row][col];
                    row--;
                    col++;
                }
                ans[idx++] = arr[row][col];
                if(col == n-1) {
                    row++;
                } else {
                    col++;
                }
                up = false;
            }
            else {
                while (row < m-1 && col > 0) {
                    ans[idx++] = arr[row][col];
                    row++;
                    col--;
                }
                ans[idx++] = arr[row][col];
                if(row == m-1) {
                    col++;
                } else {
                    row++;

                }
                up = true;
            }
            // up = !up;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[] ans = Traverse(mat);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
