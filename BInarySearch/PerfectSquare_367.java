//https://leetcode.com/problems/valid-perfect-square/

package Leetcode.BInarySearch;

import java.util.Scanner;

public class PerfectSquare_367 {

    public static boolean isPerfectSquare(int n) {
        
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
        if(ans*ans == n)
        return true;
        else
        return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));

    }
}
