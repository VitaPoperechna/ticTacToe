package org.example;

import java.util.Scanner;

public class Game {
    Board board = new Board();
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);
    //char[][] updateBoard = board.getBoard();
    public void game(){
        System.out.println("¡Vamos a jugar a Tic Tac Toe!\n" + "El tablero se compone de tres columnas: 0-1-2 y tres filas: 0-1-2");
        board.showBoard();
        System.out.println("\nTurno de: " + player.getFirstPlayer());
        System.out.print( "Escribe primero una fila y seguido una columna con un espacio en medio (ej. 1 1): ");

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        if ((row >= 0 && row <= 2) && (column >= 0 && column <= 2)) {
            if (board.getBoard()[row][column] == '_') {
                board.getBoard()[row][column] = player.getFirstPlayer();
                board.showBoard();
            } else {
                System.out.println("No está vacío");
            }
        } else {
            System.out.println("No está en rango");
        }
    }
}
