package Leetcode.Recursion.Hard;

public class NumDigitOne_233 {



    
    // public static int count_1(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         int lastdigit = n%10;
    //         if(lastdigit == 1) {
    //             count++;
    //         }
    //         n /= 10;
    //     }
    //     return count;
    // }
    // public int countDigitOne(int n) {
    //     int total_count = 0;
    //     for (int i =0; i <= n; i++) {
    //         total_count += count_1(i);
    //     }
    //     return total_count;
    // }


    public static int count_1(int n) {
        int count = 0;
        while (n > 0) {
            int lastdigit = n%10;
            if(lastdigit == 1) {
                // System.out.println(n);
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static int countdigit(int c,int n,int totalcount) {
        if(c == n+1) {
            return totalcount;
        }
        totalcount += count_1(c);
        c++;
        return countdigit(c, n, totalcount);
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(countdigit(0, n, 0));;
    }
}
