package com.workshop.ticTacToeGame;


public class TicTacToeUC1 {
    char[] gameBoard = new char[10];
    public static void main(String[] args) {
        TicTacToeUC1 methodCall = new TicTacToeUC1();
        methodCall.boardGenerator();
    }
    public void boardGenerator(){
        //gameBoard[0] = ' '; as to ignore just commenting out
        for(int board_members =1; board_members <= 9;board_members++){
            gameBoard[board_members] = ' ';
        }
    }
}
