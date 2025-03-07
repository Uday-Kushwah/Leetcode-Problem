package Leetcode.Array.Medium;

public class RotateFunction_396 {



    //Solution 1 : in this solution , we rotate the index of array
    //----------------------------------------------------------------
    /* public static int RotateFunction(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j]*(j-i);
            }
            int ind = 0;
            for (int j = arr.length-i; j< arr.length; j++) {
                s += arr[ind++]*(j);
            }
            System.out.println(s);
            ans = Math.max(ans, s);
        }
        System.out.println();
        return ans;
    }
 */





    //----------------------------------------------------------------
    //Solution 2 : in this code , we rotate the element of array
    public static void RotateArray(int[] nums) {
        int[] copyArr = new int[nums.length-1];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = nums[i];
        }

        int first = nums[nums.length-1];
        for (int i = 1; i < nums.length;i++) {
            nums[i] = copyArr[i-1];   
        }
        nums[0] = first;
    }

    public static int RotateFucntion(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            c += i*nums[i];
        }
        System.out.println(c);
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            RotateArray(nums);
            for (int j = 0; j < nums.length; j++) {
                s += j*nums[j];
            }
            System.out.println(s);
            ans = Math.max(ans, s);
        }
        System.out.println();
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        // RotateArray(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // RotateArray(arr);
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println(RotateFucntion(arr));
    }
}
