package Leetcode.Array.Hard;

public class ContainDuplicate_III_220 {


    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(i!=j && Math.abs(i-j)<=indexDiff && Math.abs(nums[i]-nums[j])<= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int indexDiff = 3, valueDiff = 0;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }
}
