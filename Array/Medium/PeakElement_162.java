package Leetcode.Array.Medium;

public class PeakElement_162 {
    public static int findPeakElement(int[] nums) {
        int ans  = 0;
        int i = 0;
        int j = 0;

        while (j < nums.length-2) {
            int peak = 0;
            if(nums[j] < nums[j+1] && nums[j+1] > nums[j+2]) {
                peak = j+1;
            }
            while(nums[i] < nums[peak] ){
                i++
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
}
