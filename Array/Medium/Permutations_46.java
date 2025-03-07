package Leetcode.Array.Medium;
import java.util.*;
public class Permutations_46 {

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> permutations = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                List<Integer> single = new ArrayList<>();
                for(int k = j+1;k < arr.length; k++) {
                    single.add(arr[i]);
                    single.add(arr[j]);
                    single.add(arr[k]);
                }
                permutations.add(single);
            }
        }
        return permutations;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
}
