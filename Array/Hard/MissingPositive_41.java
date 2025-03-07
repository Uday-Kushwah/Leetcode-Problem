package Leetcode.Array.Hard;

public class MissingPositive_41 {
    public static int maxelement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i < nums.length;i++) {
            max = Math.max(max,nums[i]);
        }
        return max;
    }
    public static int firstMissingPositive(int[] nums) {
        int max = maxelement(nums);
        boolean map[] = new boolean[max+2];
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                map[nums[i]] = true;
            }
        }
        for (int i = 1; i < map.length; i++) {
            if (!map[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,0};
        // int nums[] = {3,4,-1,1};
        // int nums[] = {7,6,-1,5};
        // int nums[] = {1,2,3,4};
        System.out.println(firstMissingPositive(nums));
    }
}
