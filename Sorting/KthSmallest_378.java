package Leetcode.Sorting;
import java.util.Arrays;
public class KthSmallest_378 {
    public static int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int[] arr = new int[m*m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[count] = matrix[i][j];
                count++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
}
