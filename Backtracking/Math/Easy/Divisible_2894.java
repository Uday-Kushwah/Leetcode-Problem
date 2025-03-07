//Ques. Link : https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/

package Leetcode.Math.Easy;

public class Divisible_2894 {
    public static int differenceOfSums(int n, int m) {
        // int totalsum = (n*(n+1))/2;
        // int multiple_of_m = n/m;
        // int sum_of_multiple_of_m = m*(multiple_of_m*(multiple_of_m+1))/2;
        // int sum_of_not_multiple_of_m = totalsum - sum_of_multiple_of_m;
        // // System.out.println(sum_of_not_multiple_of_m);
        // return sum_of_not_multiple_of_m-sum_of_multiple_of_m;

        // int sumDivisibleBym = 0;
        // int sumNotDivisibleBym = 0;
        // for (int i = 1; i <= n; i++) {
        //     if(i%m == 0) {
        //         sumDivisibleBym += i;
        //     } else {
        //         sumNotDivisibleBym += i;
        //     }
        // }
        // // System.out.println(sumDivisibleBym);
        // // System.out.println(sumNotDivisibleBym);
        // return sumNotDivisibleBym-sumDivisibleBym;
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(differenceOfSums(n, m));
    }
}
