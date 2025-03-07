package Leetcode.PrefixSum;

public class CheckAll_1893 {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        
        for (int i = 0; i < ranges.length; i++) {
            for (int j = 0; j < ranges[0].length; j++) {
                if(ranges[i][j] >= left && ranges[i][j] <= right) {
                    break ;
                } else {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] ranges = {{1,2},{3,4},{5,6}};
        int left = 2;
        int right = 5;
        System.out.println(isCovered(ranges, left, right));
    }
}
