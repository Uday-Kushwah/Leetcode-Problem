package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {

    public static void Combination( List<List<Integer>> ans,int n, int k,int idx, List<Integer> lst) {
        if(lst.size() == k) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = idx; i <= n; i++) {
            lst.add(i);
            Combination(ans,n, k,i+1, lst);
            lst.remove(lst.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(ans,n ,k,1, lst);
        System.out.println(ans);
    }
}
