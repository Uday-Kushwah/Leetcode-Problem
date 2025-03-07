package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_III_216 {

    /* public static void Combination(int n, int k, String ans, int target, int curr, int idx) {
        if(target == curr && ans.length() == k) {
            System.out.println(ans);
            return;
        }
        for (int j = idx; j <= 9; j++) {
            if(j <= target) {
                Combination(n, k, ans+j, target, curr+j, j+1);
            }
        }
    }
    public static void main(String[] args) {
        int k = 3;
        int n = 9;
        Combination(n, k, "", n, 0, 1);
    } */


    public static void Combination_3( List<List<Integer>> ans,int n, int k, int target, int curr, int idx,List<Integer> lst) {
        if(target == curr && lst.size() == k) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int j = idx; j <= 9; j++) {
            if(j <= target) {
                lst.add(j);
                Combination_3(ans,n, k, target, curr+j, j+1, lst);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int k = 3;
        int n = 9;
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Combination_3(ans,n, k, n, 0, 1,lst);
        System.out.println(ans);
    }
}
