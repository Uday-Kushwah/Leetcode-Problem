package Leetcode.Backtracking;

public class WordSearchInAllDirection{

    public static boolean Search(char[][] board, String word, int cr, int cc, int idx) {

        if(idx == word.length()) {
            return true;
        }
        if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) {
            return false;
        }
        int[] row = {-1, 0, 1, 0,-1,-1, 1, 1};
        int[] col = {0, -1, 0, 1, 1,-1,-1, 1};
        board[cr][cc] = '*';
        for (int i = 0; i < col.length; i++) {
            boolean ans = Search(board, word, cr+row[i], cc+col[i], idx+1);
            if(ans == true) {
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }
    public static void main(String[] args) {
        char[][] board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "AFESE";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean ans = Search(board, word, j, j, 0);
                    if(ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
}
