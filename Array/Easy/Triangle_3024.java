package Leetcode.Array.Easy;

public class Triangle_3024 {
    public static String triangleType(int[] nums) {
        if((nums[0]+nums[2]>nums[1]) && (nums[0]+nums[1]>nums[2]) && (nums[2]+nums[1]>nums[0]) ) {
            if(nums[0] == nums[1]) {
                if(nums[0] == nums[2]) {
                    return "equilateral";
                } else {
                    return "isosceles";
                }
            }
            else {
                if(nums[0] == nums[2] || nums[1] == nums[2]) {
                    return "isosceles";
                } else {
                    return "scalene";
                }
                
            }  
        } else {
            return "none";
        }
    }

    public static void main(String[] args) {
        // int[] sides = {4,3,2}; 
        // int[] sides = {9,4,9}; 
        int[] sides = {7,8,8}; 
        System.out.println(triangleType(sides));
    }
}
