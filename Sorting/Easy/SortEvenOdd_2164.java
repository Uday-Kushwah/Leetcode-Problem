package Leetcode.Sorting.Easy;

import java.util.Arrays;

public class SortEvenOdd_2164 {

    public static void SortArr(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int[] sortEvenOdd(int[] arr) {
        int n = arr.length;
        int odd[] = new int[n/2];
        if(n%2 == 1) {
            n = n+1;
        }
        int even[] = new int[n/2];
        int o = 0;
        int e = 0;
        for (int i = 0; i < n-2; i++) {
            if(i%2 == 0) {
                even[e++] = arr[i+2];
            } else {
                odd[o++] = arr[i+2];
            }
        }
        Arrays.sort(even);
        SortArr(odd);
        int od = 0;
        int ev = 0;
        // int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0) {
                arr[i] = even[ev++];
            } else {
                arr[i] = odd[od++];
            }
        }
        
        return arr;
    }
 
    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        // SortArr(arr);
        int[] ans = sortEvenOdd(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
