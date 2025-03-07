package Leetcode.Math;

import java.util.Scanner;

public class pra {
    
    public boolean isPowerOfTwo(int n) {
        
        int lo = 1;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo+hi)/2;
            if(Math.pow(2,mid) <= n) {
                ans = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
