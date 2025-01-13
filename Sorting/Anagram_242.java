package Leetcode.Sorting;
import java.util.*;
public class Anagram_242 {
    public static boolean isAnagram(String s, String t) {
        char[] chararray_s = s.toCharArray();
        // for (int i = 0; i < chararray_s.length; i++) {
        //     System.out.println(chararray_s[i]+" ");
        // }
        Arrays.sort(chararray_s);
        char[] chararray_t = t.toCharArray();
        // for (int i = 0; i < chararray_s.length; i++) {
        //     System.out.println(chararray_s[i]+" ");
        // }
        Arrays.sort(chararray_t);
        if(chararray_s.length != chararray_t.length) {
            return false;
        } 
        for (int i = 0; i < chararray_t.length; i++) {
            if(chararray_s[i] != chararray_t[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
