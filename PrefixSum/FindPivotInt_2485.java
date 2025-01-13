package Leetcode.PrefixSum;

public class FindPivotInt_2485 {

    public static int pivotInteger(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        // int n = nums.length;
        int[] Prefix_sum = new int[n];
        Prefix_sum[0] = nums[0];
        for (int i = 1; i < Prefix_sum.length; i++) {
            Prefix_sum[i] = nums[i]+Prefix_sum[i-1];
        }
        // for (int i = 0; i < Prefix_sum.length; i++) {
        //     System.out.print(Prefix_sum[i]+" ");
        // }
        // System.out.println();
        int[] Suffix_sum = new int[n];
        Suffix_sum[n-1] =nums[n-1];
        for (int i = n-2; i >=0; i--) {
            Suffix_sum[i] = Suffix_sum[i+1]+nums[i];
        }
        // for (int i = 0; i < Prefix_sum.length; i++) {
        //     System.out.print(Suffix_sum[i]+" ");
        // }
        // System.out.println();
        for (int i = 0; i < Suffix_sum.length; i++) {
            if(Prefix_sum[i] == Suffix_sum[i] ) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
}
