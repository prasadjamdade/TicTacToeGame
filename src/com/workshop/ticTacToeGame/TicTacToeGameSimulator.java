package com.workshop.ticTacToeGame;

public class TicTacToeGameSimulator {
    char[] gameBoard = new char[10];

    public static void main(String[] args) {
        TicTacToeGameSimulator methodCaller = new TicTacToeGameSimulator();
        methodCaller.boardGenerator();
    }

    public void boardGenerator() {
        for (int board_members = 1; board_members <= 9; board_members++) {
            gameBoard[board_members] = ' ';
        }
    }
}