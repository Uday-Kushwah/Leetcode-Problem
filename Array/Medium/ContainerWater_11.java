//Question Link : https://leetcode.com/problems/container-with-most-water/description/

package Leetcode.Array.Medium;

public class ContainerWater_11 {

    public static int ContainerWithMostWater(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        while (i < j) {
            int width = j-i;
            int min_height = Math.min(height[i], height[j]);
            max = Math.max(max, (min_height*width));
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerWithMostWater(height));
    }
}
