package Leetcode.Array;
import java.util.ArrayList;
public class ArrIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2,2, 3, 5};

        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] ) {
                    intersection.add(array1[i]);
                    break; // Avoids adding the same element multiple times
                }
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}
