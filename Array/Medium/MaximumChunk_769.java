package Leetcode.Array.Medium;

public class MaximumChunk_769 {

    public static int CountMaxChunk(int[] arr) {
        int count_chunk = 0;
        for (int i = 0; i < arr.length-1; i++) {
            while (i < arr.length-1 && arr[i] > arr[i+1]) {
                count_chunk++;
                i++;
            }
                count_chunk++;
            
        }
        return count_chunk;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,0,2,3,5};
        System.out.println(CountMaxChunk(arr));
    }
}
