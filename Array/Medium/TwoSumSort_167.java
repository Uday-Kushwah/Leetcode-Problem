package Leetcode.Array.Medium;

public class TwoSumSort_167 {
    //Brute Force, and Time Complexity = O(n^2)
    /*     
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1,-1};
        for(int i = 0;i < numbers.length;i++) {
            for(int j = i+1;j < numbers.length;j++) {
                if(numbers[i]+numbers[j] == target) {
                    ans[0] = i+1;
                    ans[1] = j+1 ;
                    return ans;
                }
            }
        }
        
        return ans;
    } */

    //Two Pointer aproach, and Time Complexity = O(n) 
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1,-1};
        int i = 0;
        int j = numbers.length-1;
        while (i < j) {
            int sum = numbers[i]+numbers[j];
            if(sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            } else if(sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
