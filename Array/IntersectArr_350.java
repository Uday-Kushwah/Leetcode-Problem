package Leetcode.Array;
import java.util.Arrays;
// import java.util.Scanner;
import java.util.ArrayList;
public class IntersectArr_350 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                lst.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int n = lst.size();
        int[] ans = new int[n];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = lst.get(k);
        }
        return ans;
        // System.out.println(lst);

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums1 = {1,2,2,1,3,7};
        int[] nums2 = {2,2,3,7,7};
        intersection(nums1, nums2);
        int[] ans = intersection(nums1, nums2) ;
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
