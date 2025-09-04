package com.dylan.tictactoe;

public class Player {
	Game.Mark symbol;

	// constructors
	public Player() {
		this.symbol = Game.Mark.X;
	}

	public Player(Game.Mark turn) {
		this.symbol = turn;
	}

	public Game.Mark getSymbol() {
		return symbol;
	}

}
