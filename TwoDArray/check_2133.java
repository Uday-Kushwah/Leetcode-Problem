package Leetcode.TwoDArray;

import java.util.Arrays;

public class check_2133 {

    public static int[] SortMatrix(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int num = (n*(n+1))/2;
        for (int i = 0; i < matrix.length-1; i++) {
            int[] ans = SortMatrix(matrix[i]);
            if(ans[i] == ans[i+1] || num != Sum(ans)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(checkValid(matrix));
    }
}
