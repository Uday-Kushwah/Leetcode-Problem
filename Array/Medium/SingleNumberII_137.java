package Leetcode.Array.Medium;

import java.util.Arrays;

public class SingleNumberII_137 {
    public  static int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int unique = Integer.MIN_VALUE;
        for(int i =1 ;i < nums.length-1;i++) {
            if(nums[i-1] < nums[i] && nums[i] < nums[i+1]) {
                unique = nums[i];
            }
        }
        if(unique == Integer.MIN_VALUE) {
            //If last element is unique
            if(nums[nums.length-2] != nums[nums.length-1] ){
                return nums[nums.length-1];
            } else {
            //If starting element is unique
                return nums[0];
            }
        
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(arr) );
    }
}
