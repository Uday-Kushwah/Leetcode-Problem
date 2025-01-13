package Leetcode.Sorting;
import java.util.Arrays;
public class KthLargest_215 {

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i]+" ");
        // }
        // System.out.println();
        // int count = 0;
        // int ans = 0;
        // for (int i = nums.length-2; i >= 0 ; i--) {
        //     if(nums[i] != nums[i+1]) {
        //         ans = nums[i+1];
        //         count++;
        //     }
        //     if(count == k) {
        //         break;
        //     }
        // }

        return nums[nums.length-k];

    }
    public static void main(String[] args) {
        int[]  nums = {3,2,1,5,6,4};
        int k = 2;
        // int[]  nums = {3,2,3,1,2,4,5,5,6};
        // int k = 4;
        System.out.println(findKthLargest(nums, k));
    }
}
