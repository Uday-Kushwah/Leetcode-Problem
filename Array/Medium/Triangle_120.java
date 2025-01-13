package Leetcode.Array.Medium;
import java.util.Arrays;
import java.util.List;
public class Triangle_120 {
    public static int minElement(List<Integer> tri) {
        int min = Integer.MAX_VALUE;
        int n = tri.size();
        for(int i = 0;i < n;i++) {
            min = Math.min(min,tri.get(i));
        }
        return min;
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int x = triangle.size();
        for (int i = 0; i < x; i++) {
            
            sum += minElement(triangle.get(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        // List<Integer> triangle = Arrays.asList(12,4,7,20);

        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2), 
            Arrays.asList(3, 4), 
            Arrays.asList(6, 5, 7), 
            Arrays.asList(4, 1, 8, 3)
        );
        System.out.println(minimumTotal(triangle));
    }
} 
