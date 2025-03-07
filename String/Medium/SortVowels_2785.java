package Leetcode.String.Medium;

public class SortVowels_2785 {

    public static boolean CheckCapitalVowel(char ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            return true;
        }
        return false;
    }

    public static boolean CheckSmallVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            return true;
        }
        return false;
    }

    public static String sortVowels(String str) {
        String ans = "";
        int[] arr_capital = new int[26];
        int[] arr_small = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if(CheckCapitalVowel(str.charAt(i))) {
                int ind_1 = str.charAt(i)-'A';
                arr_capital[ind_1]++;
            }
            if(CheckSmallVowel(str.charAt(i))) {
                int ind_2 = str.charAt(i)-'a';
                arr_small[ind_2]++;
            }
        }
        String cap = "";
        for (int i = 0; i < arr_capital.length; i++) {
            while(arr_capital[i] > 0){
                cap += (char)(i+65);
                arr_capital[i]--;
            }
        }
        // System.out.println(cap);
        String small = "";
        for (int i = 0; i < arr_capital.length; i++) {
            while(arr_small[i] > 0){
                small += (char)(i+97);
                arr_small[i]--;
            }
        }
        // System.out.println(small);
        String totalvowels = cap+small;
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(CheckCapitalVowel(ch) || CheckSmallVowel(ch)) {
                ans += totalvowels.charAt(ind);
                ind++;
            } else {
                ans += str.charAt(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        // String str = "lEetEUcOdeaauuuuu";
        String str = "lEOtcede";
        // String str = "lYmpH";
        System.out.println(sortVowels(str));
    }
}
