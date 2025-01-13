package Leetcode.SlidingWindow.Medium;

public class CountSubArray_3101 {
    public static void main(String[] args) {
        // int[] nums = {0,1,1,1};
        int[] nums = {1,0,1,1,0,1,0,0,0,1};
        // int ans = 1;
        // int size = 1;
        // for (int i = 1; i < nums.length; i++) {
        //     if(nums[i-1] != nums[i]) {
        //         size++;
        //     }
        //      else {
        //         size = 1;
        //     }
        //     ans+= size;
        // }
        // System.out.println(ans);

        int i = 0;
        int j = 1;
        int ans = 1;
        while (j < nums.length) {
            if(nums[j] != nums[j-1]) {
                j++;
            } else {
                i = j;
                j++;
            }
            ans += j-i;

            // if(nums[j] == nums[j-1]) {
            //     i = j;
            // }
            // j++;
            // ans += j-i+1;
        }
        System.out.println(ans);
    }
}
