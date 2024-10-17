package com.dylan.tictactoe;

public class Player {
	Game.Mark symbol;

	public Game.Mark getSymbol() {
		return symbol;
	}

	public Player() {
		this.symbol = Game.Mark.X;
	}

	public Player(Game.Mark turn) {
		this.symbol = turn;
	}

}
