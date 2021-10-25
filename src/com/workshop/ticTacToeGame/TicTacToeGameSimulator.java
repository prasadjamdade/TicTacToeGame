package com.workshop.ticTacToeGame;

import java.util.Scanner;

public class TicTacToeGameSimulator {
    char[] gameBoard = new char[10];
    static char userChoice, systemChoice;
    Scanner scanInput = new Scanner(System.in);


    public static void main(String[] args) {
        TicTacToeGameSimulator methodCaller = new TicTacToeGameSimulator();
        methodCaller.boardGenerator();
        methodCaller.characterSelect();
        methodCaller.boardPrint();
    }

    public void boardGenerator() {
        for (int board_members = 1; board_members <= 9; board_members++) {
            gameBoard[board_members] = ' ';
        }
    }

    public void characterSelect() {

        System.out.println("Choose your char 'X' or 'O': ");
        char playerOption = scanInput.next().toUpperCase().charAt(0);

        switch (playerOption) {
            case 'X' -> {
                userChoice = 'X';
                systemChoice = 'O';
                System.out.println("User mark is : " + userChoice + "; Computer mark is : " + systemChoice);
            }

            case 'O' -> {
                userChoice = 'O';
                systemChoice = 'X';
                System.out.println("User mark is : " + userChoice + "; Computer mark is : " + systemChoice);
            }

            default -> {
                System.out.println("Your input is invalid");
                characterSelect();
            }
        }
    }

    public void boardPrint() {
        System.out.println("\n!....Welcome Tic Tac Toe Game Simulator....!\n\n");
        System.out.println("|| " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3] + " ||\n");
        System.out.println("|| " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6] + " ||\n");
        System.out.println("|| " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + " ||");
    }
}