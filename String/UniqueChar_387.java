package Leetcode.String;

import java.util.ArrayList;

public class UniqueChar_387 {

    public static int firstUniqChar(String s) {
        ArrayList<Character> ch = new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     ch.add(i,s.charAt(i));
        // }
        // System.out.println(ch);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!ch.contains(s.charAt(i))) {
                ch.add(count,s.charAt(i));
                count++;
                // return i;
            }
        }
        System.out.println(ch);
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }
}
