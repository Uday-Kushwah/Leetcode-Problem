package Leetcode.Array.Medium;

import java.util.Arrays;

public class MaximumGap_164 {

    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxgap = 0;
        if(nums.length<2) {
            return 0;
        } else {
            for (int i = 1; i < nums.length; i++) {
                int diff = nums[i]- nums[i-1];
                maxgap = Math.max(maxgap, diff);
            }
        }
        return maxgap;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
}
