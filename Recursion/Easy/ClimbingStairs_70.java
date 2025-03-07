package Leetcode.Recursion.Easy;

public class ClimbingStairs_70 {

    public static int climbingStairs(int n,int chadGaya, String ans) {
        if(n == chadGaya) {
            System.out.print(ans+" ");
            return 1;
        }
        if(chadGaya > n) {
            return 0;
        }
        int count1 = climbingStairs(n, chadGaya+1, ans+1);
        int count2 = climbingStairs(n, chadGaya+2, ans+2);
        return count1+count2;
    }

     
    public static void main(String[] args) {
        int n = 44; // no. of stairs
        
        System.out.println("\n"+climbingStairs(n, 0, ""));
    }
}
