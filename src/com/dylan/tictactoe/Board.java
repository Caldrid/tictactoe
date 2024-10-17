package com.dylan.tictactoe;

public class Board {
    private static final int MAX_BOARD_SIZE = 3;

    Game.Mark board[][] = new Game.Mark[3][3];



    public boolean checkWin(Game.Mark currentTurn) {
        // check horizontal
        for(int index = 0; index < MAX_BOARD_SIZE; index++) {
            if(board[index][0] == currentTurn && board[index][1] == currentTurn && board[index][2] == currentTurn) {
                return true;
            }
        }

        // check vertical
        for(int index = 0; index < MAX_BOARD_SIZE; index++) {
            if(board[0][index] == currentTurn && board[1][index] == currentTurn && board[2][index] == currentTurn) {
                return true;
            }
        }

        // check diagonal
        return board[0][0] == currentTurn && board[1][1] == currentTurn && board[2][2] == currentTurn;
    }

    public void displayBoard() {
        // for(int index=0; index<3; index++) {
        //     for(int index1=0; index1<3; index1++) {
        //         board[index][index1] = Game.Mark.X;
        //     }
        // }

        System.out.println("***** Printing Board *****");
        for(int index = 0; index < MAX_BOARD_SIZE; index++) {
            for(int index1 = 0; index1 < MAX_BOARD_SIZE; index1++) {
                System.out.print(board[index][index] + " ");
            }
            System.out.print("\n");
        }
    }

}
