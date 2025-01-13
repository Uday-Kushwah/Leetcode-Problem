package Leetcode.TwoPointer.Medium;

public class LongestPalindromic_5 {
    public static boolean checkString(String str) {
        int i = 0;
        int  j = str.length()-1;
        while (i<=j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
 /* public static String longestPalindrome(String str) {
        int i = 0;
        int  j = str.length();
        while (i<=j) {
            if(checkString(str.substring(i, j))) {
                break;
            } else {
                j--;
                i++;
            }
        }
        return str.substring(i,j);
    } */


    public static String longestPalindrome(String str) {
        int maxLength = 0;
        String longPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j+1);
                if(checkString(sub)) {
                    int currentLength = sub.length();
                    if(currentLength > maxLength) {
                        maxLength = currentLength;
                        longPalindrome  = sub;
                    }
                }
            }
        }
        return longPalindrome;
    }
    public static void main(String[] args) {
    
        // String str = "babad";
        // String str = "cbbbabd";
        String str = "cbbbid";
        System.out.println(longestPalindrome(str));
    }
}
