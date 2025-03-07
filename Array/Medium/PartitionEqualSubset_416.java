package Leetcode.Array.Medium;

public class PartitionEqualSubset_416 {

    public static int MaxElementIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ind = 0;
       for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) {
                max = nums[i];
                ind = i;
            }
        }
        return ind;
    }
    public static boolean canPartition(int[] nums) {
        int maxEleInd = MaxElementIndex(nums);
        int remainSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(maxEleInd != i) {
                remainSum += nums[i];
            }
        }
        if(remainSum == nums[maxEleInd]) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // int[] arr = {1,5,11,5};
        int[] arr = {1,2,3,5};
        System.out.println(canPartition(arr));
    }
}
