package Leetcode.Sorting.Hard;

public class SlidingWindow_239 {

    // public int[] maxSlidingWindow(int[] arr, int k) {
    //     if(arr.length == 1 ) {
    //         return arr;
    //     }
    //     int ind = 0;
    //     int[] ans = new int[arr.length-k+1];
    //     for (int i = 0; i < arr.length-k+1; i++) {
    //         int max = Integer.MIN_VALUE;
    //         for (int j = i; j < k+i; j++) {
    //             max = Math.max(max,arr[j]);
    //         }
    //         ans[ind++] = max;
    //     }
    //     return ans;
    // }

    public static int max_element(int[] arr) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            m = Math.max(m, arr[i]);
        }
        return m;
    }

    public static int[] maxSumSubArray(int[] arr, int k) {
        if(arr.length == 1 ) {
            return arr;
        }
        int ind = 0;
        int[] ans = new int[arr.length-k+1];
        for (int i = 0; i < arr.length-k+1; i++) {
            int[] nums = new int[k];
            int p = 0;
            for (int j = i; j < k+i; j++) {
                nums[p++] = arr[j];
            }
            ans[ind++] = max_element(nums);
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] arr = {1};
        // int k = 1;
        // int[] arr = {1,-1};
        // int k = 1;
        int[] arr = {1,3,-1,-3,5,7};
        int k = 3;
        int[] a = maxSumSubArray(arr, k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
