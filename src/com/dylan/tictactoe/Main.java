package com.dylan.tictactoe;

public class Main {
    /*
    * list of things to check:
    * player vs player or player vs cpu
    * if player vs cpu:
    *   does player want to go first or second
    *   difficulty of cpu
    * */
    public static void main(String[] args) {
        // player1 is always X
        Board board = new Board();
        Player player1 = new Player(Game.Mark.X);
        Player player2 = new Computer(Game.Mark.O, Game.Difficulty.EASY, board);
        Game game = new Game(board, player1, player2);

        game.start();
    }
}
