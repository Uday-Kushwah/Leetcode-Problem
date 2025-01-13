package Leetcode.BInarySearch;

public class BookAllocation {

    public static boolean isitPossible(int[] pages, int nos,int min_page) {
        int student = 1;
        int readpages = 0;
        int i = 0;
        while (i < pages.length) {
            if(readpages+pages[i] <= min_page) {
                readpages += pages[i];
                i++;
            } else {
                student++;
                readpages = 0;
            }

            if(student > nos ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] pages = {10,10,15,25,40};
        int student = 2;
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < pages.length; i++) {
            hi += pages[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int mid = hi+(lo-hi)/2;
            if(isitPossible(pages, student, mid)) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        System.out.println(ans);

    }
}
