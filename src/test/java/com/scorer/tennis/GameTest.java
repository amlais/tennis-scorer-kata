package com.scorer.tennis;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void givenPlayers_NoPlayersShouldWins() {
        String playerPoints = "ABAAB";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        game.play(playerPoints);

        assertFalse(one.isWinner(two));
        assertFalse(two.isWinner(one));
    }

    @Test
    void givenPlayerPoints_PlayerOneShouldWin() {
        String playerPoints = "ABABAA";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        game.play(playerPoints);

        assertTrue(one.isWinner(two));
        assertFalse(two.isWinner(one));
    }

    @Test
    void givenPlayerPoints_PlayerTwoShouldWinGameWithAdvantage() {
        String playerPoints = "BABABABABABB";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        game.play(playerPoints);

        assertFalse(one.isWinner(two));
        assertTrue(two.isWinner(one));
    }

    @Test
    void givenPlayerPoints_ValidScenario() {
        String playerPoints = "BABABABABABB";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        assertTrue(game.play(playerPoints));
    }

    @Test
    void givenPlayerPoints_InvalidScenario() {
        String playerPoints = "BABABABABABBC";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        assertFalse(game.play(playerPoints));
    }

    @Test
    void givenPlayerPoints_ValidScenarioOnlyAScores() {
        String playerPoints = "AAAA";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        assertTrue(game.play(playerPoints));
    }

    @Test
    void givenPlayerPoints_InvalidScenarioEmptyPoints() {
        String playerPoints = "";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        assertFalse(game.play(playerPoints));
    }

    @Test
    void givenPlayerPoints_InvalidScenarioNotEnoughPoints() {
        String playerPoints = "ABA";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        assertFalse(game.play(playerPoints));
    }

    @Test
    void givenPlayerPoints_TooLongGame() {
        String playerPoints = "BABABABABABBA";
        Player one = new Player("A");
        Player two = new Player("B");
        GameDisplay gameDisplay = new GameDisplay();
        ScoreCalculator scoreCalculator = new ScoreCalculator(one, two, gameDisplay);
        Game game = new Game(scoreCalculator);

        assertFalse(game.play(playerPoints));
    }

}
