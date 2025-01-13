package Leetcode.Array;
public class MaxPrimeDifference_3115 {
    
    public static boolean chechPrimes(int n) {
        if(n == 1) {   
            return false;
        }
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

    public static int countPrimes(int[] n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            int x = n[i];
            if(chechPrimes(x)) {
                min = Math.min(i,min); 
                max = Math.max(i,max); 
            }
        }
        // System.out.println(min);
        // System.out.println(max);
        return (max-min);

    }
    public static void main(String[] args) {
        // int[] n = {4,8,2,8};
        int[] n = {1,7};
        System.out.println(countPrimes(n));
        System.out.println(chechPrimes(1));
    }
}
