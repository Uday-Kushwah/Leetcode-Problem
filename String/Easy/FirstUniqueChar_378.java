package Leetcode.String.Easy;

public class FirstUniqueChar_378 {
    public static int firstUniqChar(String s) {
        int ans = -1;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i)-'a';
            arr[ind]++;
            // System.out.println(ind);
        }
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i)-'a';
            if(arr[ind] == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // String s = "leetcode";
        String s = "leeltcode";
        System.out.println(firstUniqChar(s));
    }
}
 