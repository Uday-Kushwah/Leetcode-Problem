package Leetcode.Math.Easy;

public class SumDigitsInBaseK_1837 {

    public static int SumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int lastdigit = n%10;
            sum += lastdigit;
            n /= 10;
        }
        return sum;
    }

    public static int conversion(int n, int base) {
        int ans = 0;
        int increment = 0;
        while (n != 0) {
            int remainder = n%base;
            ans += remainder*(int)(Math.pow(10,increment));
            increment++;
            n /= base;
        }
        int sumOfBaseKdigits = SumDigits(ans); 
        return sumOfBaseKdigits;
    }
    
    public static void main(String[] args) {
        int n = 34;
        int base = 6;
        System.out.println(conversion(n, base));
    }
}
