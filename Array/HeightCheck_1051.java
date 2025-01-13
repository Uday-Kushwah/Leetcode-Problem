package Leetcode.Array;

import java.util.Arrays;

public class HeightCheck_1051 {

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] sortArray = new int[heights.length];
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < sortArray.length; i++) {
            if(sortArray[i] != heights[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
