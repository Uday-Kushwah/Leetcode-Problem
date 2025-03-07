package Leetcode.Array;

public class RotateArray_189 {

    
    public static void rotate_element(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(nums.length == 1){
            return;
        }
        rotate_element(nums, 0, n-1);
        rotate_element(nums, 0, k-1);
        rotate_element(nums, k, n-1);
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
