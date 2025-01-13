package Leetcode.SlidingWindow;

public class SubArrayProduct {

    public static void Cal_Product(int[] arr, int k) {
        int product = 1;
        int si = 0;
        int ei = 0;
        int ans = 0;
        while (ei < arr.length) {
            product *= arr[ei];
            while(product >= k ) {
                product /= arr[si];
                si++;
            }
            ans = ans + (ei-si+1);
            ei++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 10;
        Cal_Product(arr, k);
    }
}