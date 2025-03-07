package Leetcode.Math.Easy;

public class AddDigits_258 {


    // Using Recursion
    /* public static int AddDigit(int n) {
        if(n < 10) {
            return n;
        }
        int sum = 0;
        while(n > 0) {
            int last = n%10;
            sum+=last;
            n /=10;            
        }
        return AddDigit(sum);
    } */

    public static int AddDigit(int n) {
        //if no. is single digi
        if(n < 10) {
            return n;
        }
        // if number is perfectly divisible by 9
        if(n%9==0) {
            return 9;
        } else {
            return n%9;   // if number is not perfectly divisible by 9
        }
    public static void main(String[] args) {
        int n = 38;
        AddDigit(n);
    }
}
