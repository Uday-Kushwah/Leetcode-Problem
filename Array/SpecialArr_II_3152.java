package Leetcode.Array;

public class SpecialArr_II_3152 {

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        // boolean[] ans = new boolean[queries.length];
        boolean[] ans = {true};
        int count = 0;
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                if((nums[j]%2==0 && nums[j+1]%2==0) || (nums[j]%2!=0 && nums[j+1]%2!=0)){
                    // return false;
                    ans[count] = false;
                    count++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,1,2,6};
        int[][] queries = {{0,4}};
        boolean[] ans = isArraySpecial(nums, queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
