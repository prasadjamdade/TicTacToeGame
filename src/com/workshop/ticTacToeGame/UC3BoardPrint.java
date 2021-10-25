package com.workshop.ticTacToeGame;

import java.util.Scanner;

public class UC3BoardPrint {

    char[] gameBoard = new char[10];
    static char userChoice, systemChoice;
    Scanner scanInput = new Scanner(System.in);

    public static void main(String[] args) {
        UC3BoardPrint methodCall = new UC3BoardPrint();
        methodCall.boardGenerator();
        methodCall.optionLetter();
        methodCall.boardPrint();
    }
    public void boardGenerator(){
        //gameBoard[0] = ' '; as to ignore just commenting out
        for(int board_members =1; board_members <= 9;board_members++){
            gameBoard[board_members] = ' ';
        }
    }

    public void optionLetter() {

        System.out.println("Choose your mark  'X' or 'O' :");
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
                optionLetter();
            }
        }
    }

    public void boardPrint(){

            System.out.println("!....Welcome to Tic_Tac_Toe....! ");
            System.out.println("|| " + gameBoard[1] + " -- " + gameBoard[2] + " -- " + gameBoard[3] + " ||");
            System.out.println("\n");
            System.out.println("|| " + gameBoard[4] + " -- " + gameBoard[5] + " -- " + gameBoard[6] + " ||");
            System.out.println("\n");
            System.out.println("|| " + gameBoard[7] + " -- " + gameBoard[8] + " -- " + gameBoard[9] + " ||");

    }
}
