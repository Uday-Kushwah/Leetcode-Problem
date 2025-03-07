package Leetcode.String.Easy;

public class ReverseString_541 {
    public static String reverseStr(String s, int k) {
        String str = "";
        int n = s.length();
        if(n % 2*k == 0) {
            for (int i = k-1; i >= 0; i--) {
                str += s.charAt(i);
            }
            for (int i = k; i < s.length(); i++) {
                str += s.charAt(i);
            }
        } else if (n < 2*k && n >= k) {

        } else {
            
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
