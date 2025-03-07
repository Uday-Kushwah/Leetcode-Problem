package Leetcode.SlidingWindow;

public class SubarrayProduct_713 {

    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        int ans = 0, si = 0, ei = 0, p = 1;
        while (ei < arr.length) {
            // grow
            p = p*arr[ei];

            //shrink
            while (p >= k && si <= ei) {
                p = p/arr[si];
                si++;
            }
            ans = ans + (ei-si+1);
            ei++;
        }
        return ans;
    }


    // public static int numSubarrayProductLessThanK(int[] arr, int k) {
    //     int n = arr.length;
    //     int count = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //             int prod = 1; 
    //             for (int l = i; l < j+1; l++) {
    //                 prod *= arr[l];
    //             }
    //             if(prod < k) {
    //                 count++;
    //             }
    //         }

    //     }
    //     return count;
    // }

    // public static int numSubarrayProductLessThanK(int[] arr, int k) {
    //     int n = arr.length;
    //     int count = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i+1; j < n; j++) {
    //             int prod = 1; 
    //             for (int l = i; l < j; l++) {
                    
    //                 System.out.print(arr[l]+" ");
    //                 prod *= arr[j];
    //             }
    //             System.out.println();
    //             if(prod < k) {
    //                 count++;
    //             }
    //         }

    //     }
    //     System.out.print("================"+'\n'+"Answer is : ");

    //     return count;
    // }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(arr, k));
    }
}
