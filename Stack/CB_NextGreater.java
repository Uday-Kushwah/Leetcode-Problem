// https://codeskiller.codingblocks.com/problems/1053

package Leetcode.Stack;

import java.util.Stack;

public class CB_NextGreater {

    public static void NextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {50, 11, 9, 8, 13, 23, 3};
        NextGreater(arr);
    }
}
