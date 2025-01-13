package Leetcode.PrefixSum;

public class LeftAndRightSum_2574 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] Prefix_sum = new int[n];
        Prefix_sum[0] = 0;
        for (int i = 1; i < Prefix_sum.length; i++) {
            Prefix_sum[i] = nums[i-1]+Prefix_sum[i-1];
        }
        // for (int i = 0; i < Prefix_sum.length; i++) {
        //     System.out.print(Prefix_sum[i]+" ");
        // }
        // System.out.println();
        int[] Suffix_sum = new int[n];
        Suffix_sum[n-1] =0;
        for (int i = n-2; i >=0; i--) {
            Suffix_sum[i] = Suffix_sum[i+1]+nums[i+1];
        }
        // for (int i = 0; i < Prefix_sum.length; i++) {
        //     System.out.print(Suffix_sum[i]+" ");
        // }
        // System.out.println();

        for (int i = 0; i < Suffix_sum.length; i++) {
            Prefix_sum[i] = Math.abs(Prefix_sum[i]-Suffix_sum[i]);
        }
        return Prefix_sum;
        
    }
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] ans= leftRightDifference(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
