package Leetcode.Sorting;
import java.util.Arrays;
public class ThirdMax_414 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i]+" ");
        // }
        // System.out.println();
        int ans = Integer.MAX_VALUE;
        int count = 1;
        for (int i = nums.length-2; i > 0; i--) {
            if(nums[i] != nums[i+1] ) {
                ans = Math.min(ans, nums[i]);
                count++;
            }
            if(count == 3) {
                return ans;
                // break;
            }
        }
        System.out.println(count);
        if(count == 1) {
            return nums[nums.length-1];
        } else return nums[0];
    }
    public static void main(String[] args) {
        // int[] nums = {3,2,1,5,6,6,8,7,6,7,8};
        // int[] nums = {3,2,1};
        int[] nums = {2,1,1};
        System.out.println(thirdMax(nums));
    }
}
