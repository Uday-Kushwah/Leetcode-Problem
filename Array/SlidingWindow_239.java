package Leetcode.Array;

public class SlidingWindow_239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] max_arr = new int[n-k];
        for (int i = 0; i < nums.length; i++) {
            
        }
    }
    // public static int[] maxSlidingWindow(int[] nums, int k) {
    //     int n = nums.length;
    //     int[] max_arr = new int[n-k];
    //     int count = 0;
    //     for (int i = 0; i < nums.length-k; i++) {
    //         int j = 0;
    //         int max = Integer.MIN_VALUE;
    //         while (j+i<k+i) {
    //             max = Math.max(max,nums[j]);
    //             j++;
    //         }

    //         max_arr[count] = max;
    //         count++;
    //     }
    //     return max_arr;
    // }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
