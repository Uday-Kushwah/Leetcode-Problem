package Leetcode.Sorting;

import java.util.Arrays;

public class MinimumAve_3194 {
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min_average = (double)Integer.MAX_VALUE;
        for (int i = 0; i < nums.length/2; i++) {
            int left = nums[i];
            int right = nums[nums.length-1-i];
            double average = (double)(left+right)/2;
            // System.out.println(left+" "+right+" "+average);
            min_average =Math.min(min_average, average);
        }
        return min_average;
    }
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
}
