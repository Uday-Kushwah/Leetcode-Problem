package Leetcode.Array;

public class Difference_2535 {

    public static int SumOfDigit(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] > 0) {
                int lastdigit = arr[i]%10;
                sum += lastdigit;
                arr[i] /= 10;
            }
        }

        return sum;
    }

    public static int differenceOfSum(int[] nums) {
        
        int arr_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr_sum += nums[i];
        }
        // System.out.println(arr_sum);
        int digitSum = SumOfDigit(nums);
        // System.out.println(digitSum);
        return Math.abs(arr_sum-digitSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }
}
