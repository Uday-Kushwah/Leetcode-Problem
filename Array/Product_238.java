package Leetcode.Array;

public class Product_238 {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftproduct[] = new int[n];
        leftproduct[0] = 1;
        for (int i = 1; i < leftproduct.length; i++) {
            leftproduct[i] = leftproduct[i-1]*nums[i-1];
        }
        
        int[] right_product = new int[n];
        right_product[n-1] = 1;  
        for (int i = n-2; i >=0; i--) {
            right_product[i] = right_product[i+1]*nums[i+1];
        }
        for (int i = 0; i < right_product.length; i++) {
            leftproduct[i] = leftproduct[i]*right_product[i];
        }
        return leftproduct;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int ans[] = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
