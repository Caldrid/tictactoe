package com.dylan.tictactoe;

import java.util.Scanner;

public class Game {
	public enum Mark {
		X,
		O,
		EMPTY;

		@Override
		public String toString() {
			return this == EMPTY ? "_" : this.name();
		}
	}

	public enum Difficulty {EASY, MEDIUM, HARD};

	Board board;
	Player player1;
	Player player2;
	Player currentPlayer;
	Mark currentTurn = Mark.X;

	// assume player 1 is first and player 1 is always x
	public Game(Board board, Player player1, Player player2) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		this.currentPlayer = player1;
	}

	public void switchTurn() {
		if(currentTurn == Mark.X) {
			currentTurn = Mark.O;
			currentPlayer = player2;
		} else {
			currentTurn = Mark.X;
			currentPlayer = player1;
		}
	}

	// might have to change if want to make game able to play with bigger boards
	public void startGameInfo() {
		System.out.println("Welcome to tictactoe! To make a move, enter a number between 1 - 9 to make a move");

		for(int index = 0; index < 3; index++) {
			for(int index1 = 0; index1 < 3; index1++) {
				System.out.print(index*3 + index1 + 1 + " ");
			}
			System.out.print("\n");
		}
	}

	// have to ask if player vs player or player vs cpu
	// if player vs cpu, have to ask if you want player 1 or player 2
	public void start() {
		int currentMove;
		boolean isGameWon = false;

		startGameInfo();


		// game loop will exit when one person wins or there is a tie
		while(true) {
			board.displayBoard();
			System.out.println("Player " + currentPlayer.getSymbol() + "'s Turn. Please enter a move: ");
			currentMove = currentPlayer.move();

			// check if the move is valid
			while(!board.checkPlayerMove(currentMove)) {
				System.out.println("That move is invalid. Please enter a valid move (1 - 9): ");
				currentMove = currentPlayer.move();
			}

			board.move(currentPlayer, currentMove);
			// exit out of loop if someone wins or board is full
			isGameWon = board.checkWin(currentPlayer.getSymbol());
			if(isGameWon || board.isBoardFull()) {
				break;
			}
			switchTurn();
		}

		board.displayBoard();
		// have to check if win first, because could win in a move that also fills the board
		if(isGameWon) {
			System.out.println("Congratulations to Player " + currentPlayer.getSymbol() + ". They have won the game!");
		} else {
			System.out.println("The game ends in a tie! There is no winner :(");
		}
	}
}
