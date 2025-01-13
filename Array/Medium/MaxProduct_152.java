package Leetcode.Array.Medium;

public class MaxProduct_152 {
    public static void main(String[] args) {
        int nums[] = {-2,4,3,0,6,0,-2,2};
        int ans = Integer.MIN_VALUE;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            ans = Math.max(ans, prod);
            if(prod == 0) {
                prod = 1;
            }
        }
        prod = 1;
        System.out.println(ans);
        for (int i = nums.length-1; i >= 0; i--) {
            prod *= nums[i];
            ans = Math.max(ans, prod);
            if(prod == 0) {
                prod = 1;
            }
        }
        System.out.println(ans);
    }
}