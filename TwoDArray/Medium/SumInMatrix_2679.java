package Leetcode.TwoDArray.Medium;

import java.util.Arrays;

public class SumInMatrix_2679 {

    public static int matrixSum(int[][] nums) {
        int score = 0;
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);            
        }
        for (int col = 0; col < nums[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < nums.length; row++) {
                max = Math.max(max, nums[row][col]);
            }
            score += max;
        }
        return score;
    }u

    public static void main(String[] args) {
        int[][] nums = { { 7, 2, 1 },
                         { 6, 4, 2 }, 
                         { 6, 5, 3 }, 
                         { 3, 2, 1 } };
        System.out.println(matrixSum(nums));
    }
}
