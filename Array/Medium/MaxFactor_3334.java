package Leetcode.Array.Medium;

public class MaxFactor_3334 {
    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.max(a,b); i++) {
            if(a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static int lcm(int a, int b) {
        int  lcm = (a*b)/gcd(a, b);
        return lcm;
    }
    
    public static int maxScore(int[] nums) {
        int fullLCM = nums[0];
        int fullGCD = nums[0];
        for (int i = 1; i < nums.length; i++) {
            fullLCM = lcm(nums[i], fullLCM);
            fullGCD = gcd(nums[i],fullGCD);
        }
        // System.out.println(gcd);
        int maxScore = fullGCD*fullLCM;
        for (int i = 0; i < nums.length; i++) {
            int gcdWithoutCurrent = fullGCD;
            int lcmWithoutCurrent = fullLCM;

            // Remove the element at index i and calculate the new GCD and LCM
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    gcdWithoutCurrent = gcd(gcdWithoutCurrent, nums[j]);
                    lcmWithoutCurrent = lcm(lcmWithoutCurrent, nums[j]);
                }
            }

            // Step 4: Calculate the factor score without the current element
            int currentFactorScore = gcdWithoutCurrent * lcmWithoutCurrent;

            // Step 5: Update maxScore if the current factor score is higher
            maxScore = Math.max(maxScore, currentFactorScore);

        }
        return maxScore;
    }
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {2,4,8,16};
        System.out.println(maxScore(arr));
        // System.out.println(gcd(6, 8));
    }
}
