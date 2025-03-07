package Leetcode.String;

public class DetectCapital_520 {
    public static boolean detectCapitalUse(String word) {
        boolean isCapital = true;
        for (int i = 0; i < word.length(); i++) {
            int ascii_value = word.charAt(i);
            if(ascii_value >= 97 && ascii_value <= 122) {
                isCapital = false;
                break;
            }
        }
        return isCapital;
    }
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
        // System.out.println((int)'b');
        // System.out.println((int)'z');
    }
}
