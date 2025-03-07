package Leetcode.BInarySearch;

public class Search_rotated_33 {

    public static int search(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
            }

            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
       
        System.out.println(search(nums, target));
    }
}
