//https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/

package Leetcode.Array;

public class FindXOR_3158 {
    
    public static int duplicateNumbersXOR(int[] nums) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,3};
        System.out.println(duplicateNumbersXOR(nums));
    }
}
