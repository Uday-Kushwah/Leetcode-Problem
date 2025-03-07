package Leetcode.Stack;
import java.util.Stack;
public class ConstructSmallUsingDI_2375 {

    public static String ConstructSmall(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[pattern.length()+1];
        int count = 1;
        for (int i = 0; i <= pattern.length(); i++) {
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                ans[i] = count;
                count++;
                while (!stack.isEmpty()) {
                    ans[stack.pop()] = count;
                    count++;
                }
            } else {
                stack.push(i);
            }
        }
        String ansStr = "";
        for (int i : ans) {
            ansStr += i+" ";
        }
        return ansStr;
    }
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(ConstructSmall(pattern));;
    }
}
