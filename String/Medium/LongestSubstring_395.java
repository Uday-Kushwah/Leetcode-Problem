package Leetcode.String.Medium;

public class LongestSubstring_395 {

    
    public static boolean CheckSubstring(String s, int k) {
        int[] freq = new int[26];
        for(int i = 0;i < s.length();i++) {
            freq[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0 && freq[i] < k) {
                return false;
            }
        }
        return true;
    }


    public static int longestSubstring(String s, int k) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(CheckSubstring(s.substring(i,j+1), k)) {
                    ans = Math.max(ans, s.substring(i,j+1).length());
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aaabbb";
        int k = 3;
        System.out.println(CheckSubstring(s, k));
        System.out.println(longestSubstring(s, k));
    }
}


