package Leetcode.Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpecialPermute_2741 {
    
    public static List<List<Integer>> permute(int[] arr,List<Integer> ans) {
        List<List<Integer>> lst = new ArrayList<>();
        if(arr.length == 0) {
            lst.add(ans);
            return lst;
        }

        for (int i = 0; i < arr.length; i++) {
            int ch = arr[i];
            List<Integer> newAns = new ArrayList<>(ans);
            int remaining[] = new int[arr.length-1];
            for (int j = 0; j < i; j++) {
                remaining[j] = arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                remaining[j-1] = arr[j];
            }
            newAns.add(ch);
            
            lst.addAll(permute(remaining, newAns));
        }
        return lst;
    }

    public static boolean isSpecialPermutation(List<Integer> perm) {
        for (int i = 0; i < perm.size() - 1; i++) {
            int a = perm.get(i);
            int b = perm.get(i + 1);
            if (a % b != 0 && b % a != 0) {
                return false; // Condition not satisfied for this pair
            }
        }
        return true; // All pairs satisfy the condition
    }

    public static void main(String[] args) {
        // int[] ques = {2,6,3};
        int[] ques = {1,4,3};
        List<List<Integer>> lst = permute(ques, new ArrayList<>());
        int n = lst.size();
        System.out.println(lst);
        int count = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < ques.length-1; j++) {
        //         if((lst.get(i).get(j)%lst.get(i).get(j+1) == 0) || (lst.get(i).get(j+1)%lst.get(i).get(j) == 0)) {
        //             count++;
        //             System.out.println(lst.get(i));
        //         }
        //     }
        // }
        for (int i = 0; i < n; i++) {
            if(isSpecialPermutation(lst.get(i))) {
                count++;
            }
        }
        int m = (int)Math.pow(10,9)+7;
        System.out.println(count%m);
        
    }
}
