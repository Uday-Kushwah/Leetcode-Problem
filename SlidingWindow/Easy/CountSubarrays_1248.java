package Leetcode.SlidingWindow.Easy;

public class CountSubarrays_1248 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        int si =  0;
        int ei = 0;
        int ans = 0;
        int count = 0;
        while(ei < nums.length) {
            //grow
            if(nums[ei] % 2 == 1) {
                count++;
            }

            //shrink
            while(count>k & si < ei) {
                if(nums[si] % 2 == 1) {
                    count--;
                }
                si++;
            }

            // ans = Math.max(ans, ei-si+1);
            ans = ans + ei-si+1;
            ei++;
        }
        System.out.println(ans);
    }
}
