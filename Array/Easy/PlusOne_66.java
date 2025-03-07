package Leetcode.Array.Easy;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;  // digit[i] = digit[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int newArr[] = new int[n+1]; 
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        int[] arr = {9,9,9};
        int ans[] = plusOne(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
