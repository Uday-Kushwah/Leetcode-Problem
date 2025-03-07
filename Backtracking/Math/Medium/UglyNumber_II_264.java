package Leetcode.Math.Medium;

import java.util.Scanner;

public class UglyNumber_II_264 {

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

    public static int UglyNumis(int n) {
        int count = 0;
        int ans = 0;
        for (int i = 1; i <= 1690; i++) {
            if(check_Ugly_Num(i)) {
                count++;
            }
            if(count == n) {
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(UglyNumis(n));
        sc.close();
    }
}
