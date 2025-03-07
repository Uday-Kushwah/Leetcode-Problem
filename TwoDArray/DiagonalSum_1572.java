package Leetcode.TwoDArray;

public class DiagonalSum_1572 {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i == j || (mat.length-1-j)==i) {
                    sum+=mat[i][j];
                    // System.out.println(mat[i][j]);
                    sum+=mat[i][(mat.length-1-j)];
                    // System.out.println(mat[i][mat.length-1-j]);
                }
            }
        }
        return sum/2;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1}};
        System.out.println(diagonalSum(matrix));
    }
}
