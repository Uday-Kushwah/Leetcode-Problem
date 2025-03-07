package Leetcode.Recursion.Medium;

public class FindKthBit_1545 {

    public static String reverse_invert(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                ans.append('1'); 
            } else {
                ans.append('0'); 
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            answer.append(ans.charAt(i));
        }
        return answer.toString();
    }

    public static char FindBit(String previous,int k) {
        if(previous.length()> k) {
            return previous.charAt(k-1);
        }
        return FindBit(previous+'1'+reverse_invert(previous), k);

    }
    public static void main(String[] args) {
        System.out.println(FindBit("0",11));
    }
}
