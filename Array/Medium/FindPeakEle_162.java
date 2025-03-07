package Leetcode.Array.Medium;

public class FindPeakEle_162 {
    

    // Brute Force : TC(n) and SC(1)
/* 
    public static int findPeakElement(int[] nums) {
        //Handling edge cases
        if(nums.length == 1) {
            return nums[0];
        }
        
        for(int i =0 ;i < nums.length;i++) {
            //Handling edge cases
            if(i == 0 && nums[0] > nums[1]) return 0;
            if(i == nums.length-1 && nums[i-1] < nums[i]) return nums.length-1;
            if(nums[i] > nums[i+1] && nums[i-1] < nums[i]) {
               return i;
            }
        }
        return -1;
    }
 */

    // Optimesed Code : TC(log(n)) and SC(1)
    public static int findPeakElement(int[] nums) {
       
    }


    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}
