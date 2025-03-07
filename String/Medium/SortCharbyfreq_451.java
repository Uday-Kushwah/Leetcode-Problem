//Similar to Leetcode Problem : 2785

package Leetcode.String.Medium;

import java.util.Arrays;

public class SortCharbyfreq_451 {
    public static String frequencySort(String str) {
        int[] arr_capital = new int[26];
        int[] arr_small = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int ch = (int)(str.charAt(i));
            if(ch >= 65 && ch <= 90) {
                int ind_1 = str.charAt(i)-'A';
                arr_capital[ind_1]++;
            } else {
                int ind_2 = str.charAt(i)-'a';
                arr_small[ind_2]++;
            }
        }
        String ans = "";
        for (int i = 0; i < arr_capital.length; i++) {
            while(arr_capital[i] > 0){
                ans += (char)(i+65);
                arr_capital[i]--;
            }
            while(arr_small[i] > 0){
                ans += (char)(i+97);
                arr_small[i]--;
            }
        }
        char[] cha = ans.toCharArray();
        Arrays.sort(cha);
        String finalanswer = "";
        for (int i = 0; i < cha.length; i++) {
            finalanswer += cha[cha.length-1-i];
        }
        return finalanswer;
        // return ans;
    }
    public static void main(String[] args) {
        // String str = "treeABODFijds";
        String str = "bbAa";
        System.out.println(frequencySort(str));
    }
}
