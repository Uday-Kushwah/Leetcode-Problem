package Leetcode.Array.Medium;
import java.util.*;
public class Sum_3_15 {

    public static boolean check_occurence(int i, int[] arr)  {
        boolean[] check = new boolean[arr.length];
        for (int j = 0; j < check.length; j++) {
            if(check[j]==false) {
                check[j] = true;
                return false;
            }
        } 
        return true;
    }

    public static void Triplets(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        if(check_occurence(i, arr) || check_occurence(j, arr)|| check_occurence(k, arr))
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        Triplets(arr);
    }
}
