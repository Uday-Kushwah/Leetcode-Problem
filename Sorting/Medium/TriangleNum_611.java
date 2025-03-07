package Leetcode.Sorting.Medium;

import java.util.Arrays;

public class TriangleNum_611 {

    public static int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        // int[] arr = {4,2,3,4};
        System.out.println(triangleNumber(arr));
    }
}
