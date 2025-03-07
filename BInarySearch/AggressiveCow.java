package Leetcode.BInarySearch;

public class AggressiveCow {

    public static boolean isitPossible(int[] stall, int noc, int mid) {
        int cow = 1;
        int pos = stall[0];
        for (int i = 1; i < stall.length; i++) {
            if(stall[i]-pos >= mid) {
                cow++;
                pos = stall[i];
            }
            if(cow == noc) {
                return true;
            }
        }
        return false;
    }

    public static int Min_distance(int[] stall, int noc) {
        int lo = 0;
        int n = stall.length;
        int hi = stall[n-1]-stall[0];
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo+hi)/2;
            if(isitPossible(stall,noc,mid)) {
                ans = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] stall = {1,2,4,8,9};
        int noc = 3;
        System.out.println(Min_distance(stall, noc));
    }
}
