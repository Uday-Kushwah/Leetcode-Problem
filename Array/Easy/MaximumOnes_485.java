package Leetcode.Array.Easy;

public class MaximumOnes_485 {

    public static int findMaxConsecutiveOnes(int[] nums) { 
        int ans = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                ans = Math.max(ans, count);
            } else{
                count = 0;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        // int[] arr = { 0, 0, 0, 0, 0 };
        int[] arr = {1,0,1,1,1,1,0,1,1,1,1,1,1,1,1};
        // int[] arr = {1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
