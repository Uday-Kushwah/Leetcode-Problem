//https://leetcode.com/problems/number-of-good-pairs/description/

package Leetcode.Array.Easy;

public class GoodPairs_1512 {

    public static int numIdenticalPairs(int[] nums) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        // }
        // return count;



        int count = 0;
        int[] frequencyArr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            frequencyArr[nums[i]]++;
        }
        for (int i = 0; i < frequencyArr.length; i++) {
            int n = frequencyArr[i];
            count += (n*(n-1))/2;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
