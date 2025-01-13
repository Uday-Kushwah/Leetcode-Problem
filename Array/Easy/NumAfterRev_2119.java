package Leetcode.Array.Easy;

public class NumAfterRev_2119 {

    public static boolean isSameAfterReversals(int num) {
        if(num == 0) {
            return true;
        }
        int lastdigit = num%10;
        if( lastdigit == 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }
}
