/*  Leetcode Link :
https://leetcode.com/problems/count-asterisks/
 */

package Leetcode.String.Easy;

public class CountAsteriks_2315 {

    public static int countAsterisks(String s) {
        boolean enter = false;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                enter = !enter;
            }
            if (s.charAt(i) == '*' && !enter) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        // String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }
}
