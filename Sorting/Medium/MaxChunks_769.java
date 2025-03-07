package Leetcode.Sorting.Medium;

public class MaxChunks_769 {

    public static int maxChunksToSorted(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length-1;  ) {
            while (arr[i]<arr[i+1]) {
                ans++;
                i++;
            }
        }
        return arr.length-ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 4 };  
        System.out.println(maxChunksToSorted(arr));
    }
}
