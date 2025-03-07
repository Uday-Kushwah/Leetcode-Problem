package Leetcode.Array;

public class ValidBoomerang_1037 {

    public static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        double slope_12 = ((x2-x1)/(y2-y1)); 
        double slope_13 = ((x3-x1)/(y3-y1)); 
        if(slope_12 == slope_13) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[][]  points = {{1,1},{2,3},{3,2}};
        System.out.println(isBoomerang(points));
    }
}
