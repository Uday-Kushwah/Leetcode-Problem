package Leetcode.PrefixSum;

public class MinSizeSubArray_209 {

    public static int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <= nums.length; j++) {
                int sum = 0;
                int count = 0;
                for (int j2 = i; j2 < j; j2++) {
                    // System.out.print(nums[j2]+" ");
                    sum += nums[j2];
                    count++;
                }
                // System.out.println();
                if(sum >= target) {
                    len = Math.min(len, count);
                }
            }
        }
        if(len == Integer.MAX_VALUE) {
            return 0;
        } else
        return len;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3,7};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums)); 
    }
}
