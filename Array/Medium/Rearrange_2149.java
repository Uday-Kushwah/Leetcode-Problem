package Leetcode.Array.Medium;

public class Rearrange_2149 {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                ans[even] = nums[i];
                even += 2;
            } else {
                ans[odd] = nums[i];
                odd += 2;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
