package Leetcode.Matrix;

public class Reshape_566 {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int originalRows = mat.length;
        int originalCols = mat[0].length;
        if (originalRows * originalCols != r * c) {
            return mat; // Return the original matrix if reshaping is not possible
        }
        
        int[] arr = new int[mat.length*mat[0].length];
        int count = 0;
        for(int i = 0;i <mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                arr[count] = mat[i][j];
                count++;
            }
        }
        int[][] ans = new int[r][c];
        int x  =0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                ans[i][j] = arr[x];
                x++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
       
        int[][] ans =  matrixReshape(mat, r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
