package Leetcode.Sorting;

import java.util.Arrays;

public class ContainsDuplicate_217 {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isDuplicate = false;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    } 
}
