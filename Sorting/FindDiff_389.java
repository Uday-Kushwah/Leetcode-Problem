package Leetcode.Sorting;

import java.util.Arrays;

public class FindDiff_389 {

    public static char findTheDifference(String s, String t) {
         char[] chararray_s = s.toCharArray();
        Arrays.sort(chararray_s);
        char[] chararray_t = t.toCharArray();
        Arrays.sort(chararray_t);

        /* 
        0 <= s.length <= 1000
        t.length == s.length + 1
         */
        
        char ans =  chararray_t[chararray_t.length - 1];
         for (int i = 0; i < chararray_s.length; i++) {
            if(chararray_s[i] != chararray_t[i]) {
                ans = chararray_t[i];
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // String s = "abcd", t = "abcde";
        String s = "ae", t = "aea";
        System.out.println(findTheDifference(s, t));
    }
}
