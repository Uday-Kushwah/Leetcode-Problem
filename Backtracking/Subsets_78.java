package Leetcode.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {

    public static void PrintSubsets(String ques, String ans, int i) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
         
        PrintSubsets(ques, ans, i+1);
        PrintSubsets(ques, ans+ques.charAt(i), i+1);
    }g
    public static void main(String[] args) {
        String str = "abc";
        PrintSubsets(str, "", 0);
    } 


    // public static void PrintSubsets(List<List<Integer>> ans,int[] nums, int i,List<Integer> lst) {
    //     if(i == nums.length) {
    //         ans.add(new ArrayList<>(lst));
    //         return;
    //     }
         
    //     PrintSubsets(ans,nums, i+1,lst);
    //     lst.add(nums[i]);
    //     PrintSubsets(ans,nums, i+1,lst);
    //     lst.remove(lst.size()-1);
    // }
    // public static void main(String[] args) {
    //     int[] nums = {1,2,3};
    //     List<Integer> lst = new ArrayList<>();
    //     List<List<Integer>> ans = new ArrayList<>();
    //     PrintSubsets(ans,nums , 0, lst);
    //     System.out.println(ans);
    // }
}
