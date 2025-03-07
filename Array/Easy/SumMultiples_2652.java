//Question Link : https://leetcode.com/problems/sum-multiples/

package Leetcode.Array.Easy;

public class SumMultiples_2652 {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        sum += 3*(((n/3+1)*(n/3))/2);
        sum += 5*(((n/5+1)*(n/5))/2);
        sum += 7*(((n/7+1)*(n/7))/2);
        sum -= 15*(((n/15+1)*(n/15))/2);
        sum -= 35*(((n/35+1)*(n/35))/2);
        sum -= 21*(((n/21+1)*(n/21))/2);
        sum += 105*(((n/105+1)*(n/105))/2);
        return sum;
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(sumOfMultiples(n));
    }
}
