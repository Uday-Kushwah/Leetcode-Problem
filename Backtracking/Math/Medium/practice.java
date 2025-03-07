package Leetcode.Math.Medium;

import java.util.Scanner;

public class practice {
    public static boolean check_Ugly_Num(int n) {
        while (n%2==0) {
            n/=2;
        }
        while (n%3==0) {
            n/=3;
        }
        while (n%5==0) {
            n/=5;
        }
        if(n == 1) {
            return true;
        } else {
            return false;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= 100000000; i++) {
            if(check_Ugly_Num(i)) {
                count++;
            }
            if(count == n) {
                System.out.println(i);
                break;
            }
        }
    }
}