package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_II_40 {
/* 
    public static boolean aageHai(int arr[],int idx,int coin) {
        for (int i = idx+1; i < arr.length; i++) {
            if(arr[i] == coin) {
                return false;
            }
        }
        return true;
    }

    public static void Combination(int[] coin, int amount,String ans,int idx){
        if(amount == 0) {
            System.out.println(ans);
            return;
        }
        
        for (int i = idx; i < coin.length; i++) {
            if( aageHai(coin, i, coin[i]) && amount >= coin[i]) {
                Combination(coin, amount-coin[i], ans+coin[i],i+1);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {10,1,2,7,6,1,5};
        int target = 8;
        // int[] coin = {2,5,2,1,2};
        // int target = 5;
        Arrays.sort(coin);
        Combination(coin, target, "", 0);
    } */



    
  

    public static void Combination(List<List<Integer>> ans ,int[] coin, int amount, int idx,List<Integer> lst ){
        if(amount == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        
        for (int i = idx; i < coin.length; i++) {
            if(i>idx && coin[i]==coin[i-1]) continue;
            if( amount >= coin[i]) {
                lst.add(coin[i]);
                Combination(ans,coin, amount-coin[i],i+1,lst);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {10,1,2,7,6,1,5};
        int target = 8;
        // int[] coin = {2,5,2,1,2};
        // 1 1 2 5 6 7 10
        // int target = 5;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(coin);
        Combination(ans,coin, target,0,lst);
        System.out.println(ans);
    }
}
