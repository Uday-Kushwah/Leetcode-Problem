//https://leetcode.com/problems/minimum-common-value/

package Leetcode.Array;

public class MinCommon_2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0; 
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                 return nums1[i];
               
            } else if(nums1[i] < nums2[j]) {
                i++; 
            } else {
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array1 = {1,1, 2};
        int[] array2 = {2,3,4};
        // int[] array1 = {1, 2, 2, 3, 4};
        // int[] array2 = {2,2, 3, 5};
        System.out.println(getCommon(array1, array2));
    }
}
