package com.dylan.tictactoe;

import java.util.Scanner;

public class Computer extends Player {
	Game.Mark symbol;
	Game.Difficulty difficulty;
	Board board;

	public Computer(Game.Mark symbol, Game.Difficulty difficulty, Board board) {
		this.symbol = symbol;
		this.difficulty = difficulty;
		this.board = board;
	}

	public int move() {
		switch (difficulty) {
			case EASY -> { return moveEasy(); }
			case MEDIUM -> { return moveMedium(); }
			case HARD -> { return moveHard(); }
		}
		return 0;
	}

	public int moveEasy() {
		int currentMove;
		do {
			currentMove = (int)(Math.random() * (8 - 0 + 1)) + 0;
		} while(!board.checkPlayerMove(currentMove));
		return currentMove;
	}

	public int moveMedium() {
		return 0;
	}

	public int moveHard() {
		return 0;
	}
}
