package Leetcode.String.CodeSkiller;

public class PlayingString_549 {

    public static boolean checkVowel(char ch) {
        if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {
            return true;
        } else {
            return false;
        }
    } 
    public static void main(String[] args) {
        String s = "cbaeicde";
        int n = s.length();
        int i = 0;
        int ans = Integer.MIN_VALUE;
        int count = 0;
        while (i < n) {
            if(checkVowel(s.charAt(i))){
                count++;
            } else {
                // ans = Math.max(ans,count);
                count = 0;
            }
            ans = Math.max(ans,count);
            i++;
        }
        // ans = Math.max(ans,count);    //duwudhffaaeittaaiaiaiaia
        System.out.println(ans);
    }
}
