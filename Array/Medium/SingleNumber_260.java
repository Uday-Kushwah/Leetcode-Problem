package Leetcode.Array.Medium;

public class SingleNumber_260 {

    public static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int y = nums[j];
                if(x == y) {
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                ans[ind++] = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,2,5};
        int[] ans = singleNumber(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
