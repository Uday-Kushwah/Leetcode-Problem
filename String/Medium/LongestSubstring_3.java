package Leetcode.String.Medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring_3 {

    //Brute Force : TC = O(n^3)
    /* public static boolean Unique(String str) {
        boolean isUnique = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }


    public static int Longest(String str) {
        if(str.length() == 0 ) return 0;
        if(str.length() == 1 ) return 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if(Unique(str.substring(i,j))) {
                    max = Math.max(max,j-i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // String s = "abcabcbb";
        // String s = "bbbbb";
        String s = "ab";
        System.out.println(Longest(s));
    } */


    // Optimised code
    public static int lengthOfLongestSubstring(String s) { 
        List<Character>list=new ArrayList<Character>();
        int start=0;
        int end=0;
        int max=0;
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max=Math.max(max,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "aaabcddejgac";
        System.out.println(lengthOfLongestSubstring(str));
    }

}
