package com.scorer.tennis;

public class Main {
    public static void main(String[] args) {

        String playerPoints = "ABABAAA";

        GameDisplay gameDisplay = new GameDisplay();
        Player player1 = new Player("A");
        Player player2 = new Player("B");
        ScoreCalculator calculator = new ScoreCalculator(player1, player2, gameDisplay);
        Game game = new Game(calculator);

        game.play(playerPoints);
    }
}
