//https://leetcode.com/problems/minimum-operations-to-make-array-equal/

package Leetcode.Array.Medium;

public class MinimumOpe_1551 {

    public static int minOperations(int n) {

        int mid = n/2;
        if(n%2 == 1){
            return mid*(mid+1);
        } else {
            return mid*mid;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(minOperations(n));
    }
}
