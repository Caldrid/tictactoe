package com.dylan.tictactoe;

public class Board {
    private static final int MAX_BOARD_SIZE = 3;
    Game.Mark[][] board;

    public Board() {
        this.board = new Game.Mark[MAX_BOARD_SIZE][MAX_BOARD_SIZE];

        for(int index = 0; index < MAX_BOARD_SIZE; index++) {
            for(int index1 = 0; index1 < MAX_BOARD_SIZE; index1++) {
                board[index][index1] = Game.Mark.EMPTY;
            }
        }
    }

    // might have to change if want to make game able to be played with bigger boards
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

        // check diagonals
        if(board[0][0] == currentTurn && board[1][1] == currentTurn && board[2][2] == currentTurn) {
            return true;
        }

        return board[0][2] == currentTurn && board[1][1] == currentTurn && board[2][0] == currentTurn;
    }

    public void displayBoard() {
        System.out.println("***** Printing Board *****");
        for(int index = 0; index < MAX_BOARD_SIZE; index++) {
            for(int index1 = 0; index1 < MAX_BOARD_SIZE; index1++) {
                System.out.print(board[index][index1] + " ");
            }
            System.out.print("\n");
        }
    }

    public boolean isBoardFull() {
        for(int index = 0; index < MAX_BOARD_SIZE; index++) {
            for(int index1 = 0; index1 < MAX_BOARD_SIZE; index1++) {
                if(board[index][index1] != Game.Mark.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // check if the move is valid and that space is empty
    // convert integer from 0 - 8 into 2d indicies
    public boolean checkPlayerMove(int playerMove) {
        return((playerMove >= 0 && playerMove <= 8) && (board[playerMove / 3][playerMove % 3] == Game.Mark.EMPTY));
    }

    public void move(Player currentPlayer, int playerMove) {
        board[playerMove / 3][playerMove % 3] = currentPlayer.getSymbol();
    }
}
