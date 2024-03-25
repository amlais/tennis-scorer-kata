package com.scorer.tennis;

import com.scorer.tennis.utils.GameDisplay;

public class Main {
    public static void main(String[] args) {

        String playerPoints = "ABABAAA";

        Player player1 = new Player("A");
        Player player2 = new Player("B");
        ScoreCalculator calculator = new ScoreCalculator(player1, player2);
        Game game = new Game(calculator);

        game.play(playerPoints);
    }
}
