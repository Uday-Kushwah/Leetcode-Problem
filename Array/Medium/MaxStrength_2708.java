package Leetcode.Array.Medium;

import java.util.Arrays;

public class MaxStrength_2708 {

    public static long maxStrength(int[] nums) {
        long ans  = 1;
        int countnegative = 0;
        int negativeProduct = 1;
        int maxNegativeNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) {
                ans *= nums[i];
            } else {
                countnegative++;
                negativeProduct *= nums[i];
                maxNegativeNumber = Math.max(nums[i], maxNegativeNumber);
            }
        }
        if(countnegative % 2 == 0) {
            ans *= negativeProduct;
        } else {
            ans *=( negativeProduct/maxNegativeNumber);
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {0,3,-1,-5,2,5,-9};
        System.out.println(maxStrength(nums));
    }
}
