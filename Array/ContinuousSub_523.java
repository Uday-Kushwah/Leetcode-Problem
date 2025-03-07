package Leetcode.Array;

public class ContinuousSub_523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    // if(nums[i]+nums[j] == k && ) {
    
                    // }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums ={23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
}
