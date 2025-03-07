// Question : https://leetcode.ca/all/277.html
// Time Complexity : O(n)
package Leetcode.Stack;

import java.util.Stack;

public class FindCelebrity_277 {

    public static int FindCelebrity(int[][] knows) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < knows.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (knows[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }
        int celebrity = stack.pop();
        for (int i = 0; i < knows.length; i++) {
            if (celebrity == i) {
                continue;
            }
            if (knows[celebrity][i] == 1 || knows[i][celebrity] == 0) {
                return -1;
            }
        }
        return celebrity;
    }

    public static void main(String[] args) {
        int[][] knows = { { 0, 1, 1, 1 },
                { 1, 0, 1, 1 },
                { 0, 0, 0, 0 },
                { 1, 1, 1, 0 } };
        System.out.println(FindCelebrity(knows));
    }
}
