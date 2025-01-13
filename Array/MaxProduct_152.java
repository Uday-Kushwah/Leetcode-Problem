package Leetcode.Array;

public class MaxProduct_152 {
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int ans = 1;
                for (int j2 = i; j2 <= j; j2++) {
                    // System.out.print(nums[j2]+"*");
                    ans *= nums[j2];
                    
                }
                // System.out.println(" = "+ans);
                max = Math.max(max, ans);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
