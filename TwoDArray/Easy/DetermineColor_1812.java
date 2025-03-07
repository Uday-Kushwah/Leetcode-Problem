package Leetcode.TwoDArray.Easy;

public class DetermineColor_1812 {
    public static boolean squareIsWhite(String coordinates) {
        char ch1 = coordinates.charAt(0);
        System.out.println(ch1);
        int col = ch1 - 'a';
        char ch2 = coordinates.charAt(1);
        System.out.println(ch2);
        int row =  ch2 - '0';
         
        if((row%2 == 0 && col %2 == 0 )||( row%2 == 1 && col%2 == 1)) {
            return true;
        } else {
            return false;
        }
    } 
    public static void main(String[] args) {
        String coordinate = "a1";
        System.out.println(squareIsWhite(coordinate));
    }
}
