package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {

    public static void Combination(int[] coin, int amount, List<Integer> lst,int idx, List<List<Integer>> ans) {
        if(amount == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount >= coin[i]) {
                lst.add(coin[i]);
                Combination(coin, amount-coin[i], lst,i,ans);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int target = 8;
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin, target, lst,0,ans);
        System.out.println(ans);
    }
}
