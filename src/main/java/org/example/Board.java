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
}

