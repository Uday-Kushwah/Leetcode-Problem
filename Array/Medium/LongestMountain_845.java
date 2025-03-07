package Leetcode.Array.Medium;

public class LongestMountain_845 {

    public static int longestMountain(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length-1;i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                int count = 1;
                int j = i;
                while (j>0 && arr[j-1] < arr[j]) {
                    j--;
                    count++;
                }
                while (i < arr.length-1 && arr[i] > arr[i+1]) {
                    i++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 1, 4, 7, 3, 2, 5 };
        int[] arr = { 2, 2,2,2,2, };
        System.out.println(longestMountain(arr));
    }
}
