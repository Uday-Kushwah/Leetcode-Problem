package Leetcode.Array;

public class PerfectNum_507 {

    public  static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1;i < num;i++) {
            if(num%i== 0) {
                sum += i;
            }
        }
        if(sum == num) {
            return true;
        } else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
        
    }
}
