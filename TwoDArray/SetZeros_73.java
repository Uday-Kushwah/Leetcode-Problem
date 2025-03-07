package Leetcode.TwoDArray;

import java.util.ArrayList;

public class SetZeros_73 {
    public static void setZeroes(int[][] matrix) {
        boolean isfound = false;
        if(matrix.length==1 ) {
            for (int i = 0; i < matrix[0].length; i++) {
                if(matrix[0][i] == 0 ) {
                    isfound = true;
                    break;
                }
            }
            if(isfound) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[0][j] = 0;
                }
            }
            return;
        }
        boolean is_found = false;
        if(matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[i][0] == 0) {
                    is_found = true;
                    break;
                }
            }
            
            if(is_found) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][0] = 0;
                }
            }
            return;
        }



        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < row.size(); i++) {
            int r = row.get(i);
            int c = col.get(i);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][c] = 0;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[r][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,1}};
        // int[][] matrix = {{3},{4},{0},{7}};
        // int[][] matrix = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};

        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
