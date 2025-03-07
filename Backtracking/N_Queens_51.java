package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_51 {
    
    public static void Display(List<List<String>> ans,boolean[][] board) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = "";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == true) {
                    s += "Q";
                } else {
                    s+= ".";
                }
            }
            lst.add(s);
        }
        ans.add(lst);
    }

    public static boolean IsItSafe(boolean[][] board, int totalQueen, int row, int col) {

        // checking in upward direction
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // checking in upward left direction(left diagonal)
        r = row;
        int c = col;
        while (r >= 0 && c >= 0 ) {
            if(board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        // checking in upward right direction(right diagonal)
        r = row;
        c = col;
        while (r >= 0 && c < board.length ) {
            if(board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void Queen(List<List<String>> ans ,boolean[][] board, int totalQueen, int row) {

        if (totalQueen == 0) {
            Display(ans,board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (IsItSafe(board, totalQueen, row, col)) {
                board[row][col] = true;
                Queen(ans,board, totalQueen - 1, row + 1);
                board[row][col] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        Queen(ans,board, n, 0);
        System.out.println(ans);
    }
}
