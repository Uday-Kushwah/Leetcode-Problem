package Leetcode.Array.Medium;

public class SearchRotate_81 {

    public static boolean search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while (i <= j) {
            int mid = i+ (j-i)/2;
            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] < target) {
                if(nums[mid] < target && target <= nums.length) {
                    i = mid+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
