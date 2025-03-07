package Leetcode.Array.Medium;
import java.util.ArrayList;
import java.util.Arrays;
public class TopKEle_347 {

    // public static int[] topKFrequent(int[] nums, int k) {
    //     // ArrayList<Integer> lst = new ArrayList<>();
    //     if(nums.length == 1) {
    //         return nums;
    //     }
    //     int ans[] = new int[k];
    //     int count = 0;
    //     boolean isSame = true;
    //     for (int i = 0; i < nums.length-1; i++) {
    //         if(nums[i] != nums[i+1]) {
    //             isSame = false;
    //         }
    //     }
    //     if(isSame) {
    //         for (int i = 0; i < ans.length; i++) {
    //             ans[i] = nums[i];
    //         }
    //     }
    //     for (int i = 0; i < nums.length-1; i++) {
    //         if(nums[i] != nums[i+1]) {
    //             ans[count++] = nums[i];
    //         }
    //         if(count == k) {
    //             break;
    //         }
    //     }
    //     return ans;
    // }


    public static int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        // if(nums.length == 1) {
        //     return nums;
        // }
        Arrays.sort(nums);
        int ans[] = new int[k];
        boolean isSame = true;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                isSame = false;
            }
        }
        if(isSame) {
            for (int i = 0; i < ans.length; i++) {
                ans[i] = nums[i];
            }
        }
        if (isSame) {
            return ans;
        }
        lst.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                lst.add(nums[i]);
            }
        }
        System.out.println(lst);
        // lst.add(nums.length-1);
        for (int i = 0; i < ans.length; i++) {
            ans[i] = lst.get(i);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        // int[] arr = {1,1,1,2,2,3};
        // int k = 2;
        // int[] arr = {1};
        // int k = 1;
        // int[] arr = {1,2};
        // int k = 2;
        // int[] arr = {-1,-1};
        // int k = 2;
        
        int[] arr = {4,1,-1,2,-1,2,3};
        int k = 2;

        int ans[] = topKFrequent(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
