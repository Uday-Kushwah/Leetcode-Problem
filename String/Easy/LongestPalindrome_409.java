package Leetcode.String.Easy;

public class LongestPalindrome_409 {
    // public static int longestPalindrome(String s) {
    //     boolean isAllelementsame = true;
    //     for(int i = 0;i < s.length()-1;i++) {
    //         if(s.charAt(i) != s.charAt(i+1)) {
    //             isAllelementsame = false;
    //         }
    //     }
    //     if(isAllelementsame) {
    //         return s.length();
    //     }
    //     int ans = 0;
    //     int[] freq_lower = new int[26];
    //     int[] freq_upper = new int[26];
    //     for (int i = 0; i < s.length(); i++) {
    //         if((char)(s.charAt(i))>65 && (char)(s.charAt(i))<=90) {
    //             freq_upper[s.charAt(i)-'A']++;
    //         } else {
    //             freq_lower[s.charAt(i)-'a']++;
    //         } 
    //     }

    //     for (int i = 0; i < freq_lower.length; i++) {
    //         if(freq_lower[i] == 1) {
    //             ans += 1;
    //             break;
    //         }
    //     }
    //     if(ans != 0) {
    //         for (int i = 0; i < freq_lower.length; i++) {
    //             if(freq_upper[i] == 1) {
    //                 ans += 1;
    //                 break;
    //             }
    //         }
    //     }
    //     for (int i = 0; i < freq_lower.length; i++) {
    //         if(freq_lower[i] % 2 == 0) {
    //             ans += freq_lower[i];
    //         }
    //         if(freq_upper[i] % 2 == 0) {
    //             ans += freq_upper[i];
    //         }
    //     }
    //     return ans;
    // }



    public static int longestPalindrome(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int ans = 0;
        boolean hasodd = false;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]%2 == 0){
                ans += freq[i];
            } else {
                ans += freq[i]-1;
                hasodd = true;
            }
        }
        if (hasodd) {
            ans += 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
