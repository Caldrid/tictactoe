package com.dylan.tictactoe;

public class Game {
	public enum Mark {X, O}
	Board board;
	Player player1;
	Player player2;
	Mark currentTurn = Mark.X;
	Player currentPlayer = player1;

	public Game(Board board, Player player1, Player player2) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
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

	public void start() {
		if(currentTurn == Mark.X) {

		}
	}
}
