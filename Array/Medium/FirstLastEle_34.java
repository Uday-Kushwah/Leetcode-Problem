package Leetcode.Array.Medium;

public class FirstLastEle_34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(ans[0] == -1) {
                    ans[0] = i;  
                }
                ans[1] = i;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
