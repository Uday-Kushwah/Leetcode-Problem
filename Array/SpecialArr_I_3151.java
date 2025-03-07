//https://leetcode.com/problems/special-array-i/

package Leetcode.Array;

public class SpecialArr_I_3151 {

    public static boolean isArraySpecial(int[] nums) {

        if(nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if((nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,4};
        // int[] nums = {4,3,1,6};
        System.out.println(isArraySpecial(nums));
    }
}
