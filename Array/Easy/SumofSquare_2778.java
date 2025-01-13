package Leetcode.Array.Easy;

public class SumofSquare_2778 {

    public static int sumOfSquares(int[] nums) {
        int sum = nums[0]*nums[0];
        for(int i =1;i< nums.length;i++) {
            if(nums.length%(i+1)==0) {
                sum += nums[i]*nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));
    }
}