package Leetcode.Array.Medium;

// import java.util.Arrays;

public class ShortUnsortArr_581 {

    public static int findUnsortedSubarray(int[] nums) {

        int start =0,end=0;
        for (int k = 0; k < nums.length-1; k++) {
            if(nums[k]>nums[k+1]) {
                start = k;
                break;
            }
        }
        for (int k = nums.length-2; k >= 0; k--) {
            if(nums[k]>nums[k+1]) {
                end =nums.length-( k+1);
            }
        }
        System.out.println(start+" "+end);
        return -start+end;

        // int count = 0;
        // int n = nums.length;
        // int[] newarr = new int[n];
        // for (int i = 0; i < newarr.length; i++) {
        //     newarr[i] = nums[i];
        // }
        // Arrays.sort(nums);
        // for (int i = 0; i < newarr.length; i++) {
        //     if(nums[i] != newarr[i] ) {
        //         count++;
        //     }
        // }
        // return count;
    }
    public static void main(String[] args) {
        // int[] nums = {2,6,4,8,10,9,15};
        int[] nums = {1,2,3,9,17,12,4,7,8,3,10,20,21};
        System.out.println(findUnsortedSubarray(nums));
    }
}
