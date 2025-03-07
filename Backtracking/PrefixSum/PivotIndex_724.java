package Leetcode.PrefixSum;
public class PivotIndex_724 {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
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
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = {1,7,3,6,5,6};
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }
}
