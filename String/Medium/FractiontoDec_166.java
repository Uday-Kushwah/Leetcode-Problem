package Leetcode.String.Medium;

public class FractiontoDec_166 {

    public static String fractionToDecimal(int numerator, int denominator) {
        // if(numerator > denominator) {
            return ((double)numerator)/denominator+"";
        // }
        // return "";
    }
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 2;
        System.out.println(fractionToDecimal(numerator, denominator));
    }
}
