package org.example;

import java.util.Scanner;

public class Game {
    Board board = new Board();
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);

    public void game() {
        System.out.println("¡Vamos a jugar a Tic Tac Toe!\n" + "El tablero se compone de tres columnas: 0-1-2 y tres filas: 0-1-2");

        while (true) {
            board.showBoard();
            System.out.println("\nTurno de: " + player.getPlayer()[player.getCurrentIndex()]);

            int row, column;

            while (true) {
                System.out.print("Escribe primero una fila y seguido una columna con un espacio en medio (ej. 1 1): ");
                row = scanner.nextInt();
                column = scanner.nextInt();

                if ((row >= 0 && row <= 2) && (column >= 0 && column <= 2)) {
                    if (board.getBoard()[row][column] == '_') {
                        break;
                    } else {
                        System.out.println("Posición ocupada.");
                    }
                } else {
                    System.out.println("La fila o columna no existe.");
                }
            }
            board.getBoard()[row][column] = player.getPlayer()[player.getCurrentIndex()];

            player.changeTurn();
        }
    }
}
