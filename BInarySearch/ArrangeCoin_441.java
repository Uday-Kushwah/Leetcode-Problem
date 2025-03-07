package Leetcode.BInarySearch;

public class ArrangeCoin_441 {
    
    public static long CheckStair(long n) {
        return (n*(n+1))/2;
    }

    public static int arrangeCoins(int n) {
        int lo = 0;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = hi + (lo- hi)/2;
            if(CheckStair(mid) <= n) {
                ans = mid;
                lo = mid+1;
            } else {
                hi= mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(arrangeCoins(n));
    }
}
