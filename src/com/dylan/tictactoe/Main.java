package com.dylan.tictactoe;

public class Main {
    public static void main(String[] args) {
        // player1 is always X
        Board board = new Board();
        Player player1 = new Player(Game.Mark.X);
        Player player2 = new Player(Game.Mark.O);
        Game game = new Game(board, player1, player2);
        game.start();
    }
}
