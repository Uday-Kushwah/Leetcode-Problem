package Leetcode.Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class LexicoNumber_386 {
        
    public static void LexicographicalNumber(int n, int curr,List<Integer> lst) {
        if(curr > n) {
            return;
        }
        if(curr != 0){

            lst.add(curr);
        }
        int i = 0;
        if(curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            LexicographicalNumber(n, curr*10+i,lst);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        List<Integer> lst = new ArrayList<>();
        LexicographicalNumber(n,0,lst);
        System.out.println(lst);
    }
}
