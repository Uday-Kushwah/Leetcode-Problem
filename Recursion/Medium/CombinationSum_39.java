package Leetcode.Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {

    public static boolean aageHai(int[] coin, int idx,int num) {
        for (int i = idx+1; i < coin.length; i++) {
            if(coin[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static void Combination(int[] coin, int amount,List<Integer> lst,int idx,List<List<Integer>> ans ) {
        if(amount == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            
            if(amount >= coin[i]) {
                lst.add(coin[i]);
                Combination(coin,amount-coin[i],lst,i+1,ans);
                lst.remove(lst.size()-1);
            }
        }
    }
        

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(arr, target, lst,0, ans);
        System.out.println(ans);

    }
}
