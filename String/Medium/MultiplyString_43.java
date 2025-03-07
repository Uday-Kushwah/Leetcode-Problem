package Leetcode.String.Medium;

public class MultiplyString_43 {
    public static String multiply(String num1, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        return (n1*n2)+"";

    }
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";
        System.out.println(multiply(s1, s2));
    }
}
