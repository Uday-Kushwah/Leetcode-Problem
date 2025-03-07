package Leetcode.String.Medium;

public class RemoveDuplicates_316 {
    public static String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for(int i = 0;i < s.length();i++) {
            freq[s.charAt(i)-'a']++;
        }
        String ans = "";
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                ans += (char)(i+97);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
}
