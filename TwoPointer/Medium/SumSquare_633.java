package Leetcode.TwoPointer.Medium;

public class SumSquare_633 {

    public static boolean SumOfSquare(int c) {
        
        //Worst Case : TC = O(n^2)
        // for (int i = 0; i <= c; i++) {
        //     for (int j = i; j <= c; j++) {
        //         if((i*i+j*j) == c) {
        //             // System.out.println(i+" "+j);
        //             return true;
        //         }
        //     }
        // }
        // return false;


        long i = 0;
        // long j = (long)Math.sqrt(c);
        long j = c;
        while (i <= j) {
            if(i*i + j*j == c) {
                return true;
            } else if(i*i + j*j < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //edge cases : 1,2,4,16
        int c = 1;
        System.out.println(SumOfSquare(c));
    }
}
