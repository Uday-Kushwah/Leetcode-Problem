package Leetcode.String.Medium;

public class ReverseWords_151 {
    public static void main(String[] args) {
        // String s = "    the sky   p is   p    blue   p         ";
        // String s = "Let's take LeetCode contest";
        String s = "a good   example";

        // System.out.println(s);
        s = s.trim();
        // System.out.println(s);
        String[] arr = s.split("\s+");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println();
        // }
        // System.out.println(Arrays.toString(arr));
        String ans = "";
        for (int i = arr.length-1; i >0 ; i--) {
            ans += arr[i]+" ";
        }
        ans += arr[0];
        System.out.print(ans);
        // System.out.print("=");
    }
}
