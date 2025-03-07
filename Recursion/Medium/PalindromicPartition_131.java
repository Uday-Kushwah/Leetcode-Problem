package Leetcode.Recursion.Medium;
import java.util.ArrayList;
import java.util.List;

public class PalindromicPartition_131 {

    public static boolean CheckPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void PalindromePartition(String ques, List<String> lst , List<List<String>> ans) {
        if(ques.length() == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if(CheckPalindrome(s)) {
                lst.add(s);
                PalindromePartition(ques.substring(i), lst,ans);
                lst.remove(lst.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        String str = "nitin";
        List<String> lst = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        PalindromePartition(str, lst,ans);
        System.out.println(ans);
    }
}
