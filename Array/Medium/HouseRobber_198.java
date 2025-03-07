package Leetcode.Array.Medium;

public class HouseRobber_198 {
    

    public static int rob(int[] nums) {
        int count_odd = 0;
        int count_even = 0;
        for(int i = 0;i < nums.length; i++) {
            if(i % 2 == 0) {
                count_even += nums[i];
            } else {
                count_odd += nums[i];
            }
        }
        System.out.println(count_even);
        System.out.println(count_odd);
        return Math.max(count_odd, count_even);
    }
    public static void main(String[] args) {
        int[] amount = {2,7,9,3,1};
        System.out.println(rob(amount));
    }
}
