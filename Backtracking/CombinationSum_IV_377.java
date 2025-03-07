package Leetcode.Backtracking;

public class CombinationSum_IV_377 {
    
    // Print all possible combination
    /* public static int Combination_4(int[] nums, int target, String ans) {
        if(target == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= target) {
                count += Combination_4(nums, target-nums[i], ans+nums[i]+" ");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println( Combination_4(nums, target,""));
    } */


    // Count total no. of Permutation
    public static int Combination_4(int[] nums, int target ) {
        if(target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= target) {
                count += Combination_4(nums, target-nums[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 35;
        System.out.println( Combination_4(nums, target));
    }
}
