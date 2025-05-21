package org.example;

public class Board {
    private char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public char[][] getBoard() {
        return board;
    }
    public void showBoard() {
         for (char[] value : board) {
            for (char c : value) {
                 System.out.print("\t" + c);
            }
          System.out.println();
         }
    }
    public boolean checkWin(char piece) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == piece && board[i][1] == piece && board[i][2] == piece) ||
                    (board[0][i] == piece && board[1][i] == piece && board[2][i] == piece)) {
                return true;
            }
        }

        if ((board[0][0] == piece && board[1][1] == piece && board[2][2] == piece) ||
                (board[0][2] == piece && board[1][1] == piece && board[2][0] == piece)) {
            return true;
        }
        return false;
    }
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}

