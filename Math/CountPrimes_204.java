package Leetcode.Math;

public class CountPrimes_204 {

    public static boolean chechPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n-1; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(chechPrimes(i)) {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int n = 0;;
        System.out.println(countPrimes(n));
    }
}
