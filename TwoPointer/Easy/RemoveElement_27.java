package Leetcode.TwoPointer.Easy;

public class RemoveElement_27 {

    public static int removeElement(int[] nums, int k) {
        int i = 0;
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != k) {
                nums[i++] = nums[j];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
