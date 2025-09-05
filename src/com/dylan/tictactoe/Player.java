package com.dylan.tictactoe;

import java.util.Scanner;

public class Player {
	Game.Mark symbol;

	// constructors
	public Player() {
		this.symbol = Game.Mark.X;
	}

	public Player(Game.Mark symbol) {
		this.symbol = symbol;
	}

	public Game.Mark getSymbol() {
		return symbol;
	}

	public int move() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt() - 1;
	}
}
