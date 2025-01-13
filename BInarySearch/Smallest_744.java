//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package Leetcode.BInarySearch;

public class Smallest_744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int lo = 0;
        int hi = letters.length;
        char ans = ' ';
        if(target >= letters[letters.length-1]) {
            return letters[0];
        }
        while (lo <= hi) {
            int mid = (lo+hi)/2;
            if(letters[mid] > target){
                ans = letters[mid];
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        char[] letters = {'e','e','e','k','q','q','q','v','v','y'};
        char target = 'y';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
