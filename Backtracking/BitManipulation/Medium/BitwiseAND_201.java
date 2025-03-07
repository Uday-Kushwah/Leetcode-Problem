package Leetcode.BitManipulation.Medium;

public class BitwiseAND_201 {

    public static int rangeBitwiseAnd(int left, int right) {
        int ans = left;
        for (int i = left; i <= right; i++) {
            ans &= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int left = 1;
        int right  =2147483647;
        System.out.println(rangeBitwiseAnd(left,right));
    }
}
