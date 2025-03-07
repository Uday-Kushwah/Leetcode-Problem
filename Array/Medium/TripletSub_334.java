package Leetcode.Array.Medium;

public class TripletSub_334 {

    public static boolean increasingTriplet(int[] nums) {
        // Brute Force : TC = O(n^3)
        /* for(int i =0;i < nums.length-2;i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]<nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false; */


        //TC : O(n)    SC : O(n)
        /* int n = nums.length;
        int left_min[] = new int[n];
        int right_max[] = new int[n];
        left_min[0] = nums[0];
        right_max[n-1] = nums[n-1];
        for (int i = 1; i < n; i++) {
            left_min[i] = Math.min(left_min[i-1],nums[i]);
        }
        for (int i = n-2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i+1], nums[i]);
        }

        for (int i = 0; i < right_max.length; i++) {
            if(left_min[i] < nums[i] && nums[i] < right_max[i]) {
                return true;
            }
        }
        return false; */



        //TC : (n)      SC : O(1)
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int third = nums[i];
            //ask for num1
            if(third <= first) {
                first = third;
            } else if(third <= second) {  //ask for num2
                second = third;
            } else {
                return true ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        // int[] arr = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(arr));
    }
}
