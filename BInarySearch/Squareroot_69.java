package Leetcode.BInarySearch;

public class Squareroot_69 {
    public static int mySqrt(int n) {
        // return (int)(Math.pow(x,0.5)) ;       
        int lo = 1;
            int hi = n;
            int ans = 0;
            while (lo <= hi) {
                int mid = hi + (lo-hi)/2;
                if(Math.pow(mid,2) <= n) {
                    ans = mid;
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }
            return ans;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(mySqrt(n));
    }
}
