package Leetcode.Math.Easy;

public class Num_1bits_191 {

    public static int count_1(int n) {
        int count = 0;
        while (n > 0) {
            int last_digit = n%2;
            if(last_digit == 1) count++;
            n /= 2;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(count_1(n));
    }
}
