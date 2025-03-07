package Leetcode.Recursion.Medium;
import java.util.*;
public class Permutations_46 {

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

    public static void main(String[] args) {
        int[] ques = {1,2,3};
        System.out.println(permute(ques, new ArrayList<>()));
    }
}
