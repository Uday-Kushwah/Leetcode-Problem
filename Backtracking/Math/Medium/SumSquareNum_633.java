package Leetcode.Math.Medium;
public class SumSquareNum_633 {

    public static boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long)Math.sqrt(c);
        boolean isFound = false;
        while (i < j) {
            if(i*i + j*j == c) {
                isFound = true;
                break;
            } else if(i*i + j*j < c) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(i+" "+j);
        return isFound;
    }
    public static void main(String[] args) {
        int c = 2;
        System.out.println(judgeSquareSum(c));
    }
}
