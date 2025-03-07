package Leetcode.Sorting.Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement_229 {

    public static List<Integer> majorityElement(int[] nums) {
        
        List<Integer> lst = new ArrayList<>();
        // if(nums.length == 1) {
        //     lst.add(nums[0]);
        //     return lst;
        // }
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++) {
           int count  =1;
            while(i < nums.length-1 && nums[i] == nums[i+1]) {
                count++;
                i++;
            }
            if(count > nums.length/3){
                lst.add(nums[i]);
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        // int[] nums = {3,2,3,2};
        // int[] nums = {1,2};
        // int[] nums = {2,2};
        int[] nums = {2};
        System.out.println(majorityElement(nums));
    }
}
