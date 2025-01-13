package Leetcode.Array;

public class Sum_1685 {

    // public static int[] getSumAbsoluteDifferences(int[] nums) {
    //     int arr[] = new int[nums.length];
    //     for (int i = 0; i < arr.length; i++) {
    //         int sum = 0;
    //         for (int j = 0; j < arr.length; j++) {
    //             sum += Math.abs(nums[i]-nums[j]);
    //         }
    //         arr[i] = sum;
    //     }
    //     return arr;
    // }
    // public static void main(String[] args) {
    //     int[] arr= {1,2,3,4,5,7};
    //     int[]ans = getSumAbsoluteDifferences(arr);
    //     for (int i = 0; i < ans.length; i++) {
    //         System.out.print(ans[i]+" ");
    //     }
    // }


    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        leftSum[0] = nums[0];
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i-1]+nums[i];
        }
        System.out.print("Left Sum : ");
        for (int i = 0; i < leftSum.length; i++) {
            System.out.print(leftSum[i]+" ");
        }
        System.out.println();

        int[] right_sum = new int[n];
        right_sum[n-1] = nums[n-1];
        for (int i = n-2; i >=0; i--) {
            right_sum[i] = right_sum[i+1]+nums[i];
        }
        System.out.print("Right Sum : ");
        for (int i = 0; i < leftSum.length; i++) {
            System.out.print(right_sum[i]+" ");
        }
        System.out.println();

        int[] ans = new int[n];
        for (int i = 0; i < right_sum.length; i++) {
            ans[i] = (((i)*nums[i])-(leftSum[i]-nums[i]))+((right_sum[i]-nums[i])-((n-i-1)*nums[i]));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,7};
        // getSumAbsoluteDifferences(arr);
        int[]ans = getSumAbsoluteDifferences(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
