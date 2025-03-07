package Leetcode.BInarySearch;

public class Find_34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int lo = 0;
        int hi = nums.length;
        int k = 0;
        while(lo <= hi ) {
            int mid = hi+(lo-hi)/2;
            if(nums[mid] == target) {
                ans[0] = mid;
                k = mid;
                // k++;
                // if(k == 2) {
                //     break;
                // }
            }
            else if(nums[mid] > target) {
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
