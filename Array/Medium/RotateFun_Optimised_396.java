package Leetcode.Array.Medium;

public class RotateFun_Optimised_396 {

    public static int RotateFunction(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        int f_0 = 0;
        for (int i = 0; i < n; i++) {
            f_0 += arr[i]*i;
        }
        ans = f_0;

        for (int i = 0; i < n; i++) {
            int c = f_0+sum-n*arr[n-i-1];
            ans = Math.max(ans, c);
            f_0 = c;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        System.out.println(RotateFunction(arr));
    }
}
