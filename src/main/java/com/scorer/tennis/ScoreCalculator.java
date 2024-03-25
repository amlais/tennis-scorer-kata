package com.scorer.tennis;

import com.scorer.tennis.enums.GameStatus;

import java.util.Objects;

public class ScoreCalculator {

    private final Player playerOne;

    private final Player playerTwo;

    private final GameDisplay gameDisplay;

    public ScoreCalculator(Player playerOne, Player playerTwo, GameDisplay gameDisplay){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.gameDisplay = gameDisplay;
    }

    /**
     * Cette methode permet de mettre à jour le currentScore de
     * chaque joueur afin d'évaluer le score
     * @param currentPointScorer the remaining points scored by players
     */
    public void updateCurrentScore(String currentPointScorer){
        if(playerOne.getName().equals("" + currentPointScorer.charAt(0)))
            playerOne.addPoint();

        if(playerTwo.getName().equals("" + currentPointScorer.charAt(0)))
            playerTwo.addPoint();
    }

    public GameStatus isGameWon(){
        if(playerOne.isWinner(playerTwo) || playerTwo.isWinner(playerOne))
            return GameStatus.WON;
        return GameStatus.NOTWON;
    }

    public Player getWinner(){
        if(playerOne.isWinner(playerTwo))
            return playerOne;
        if(playerTwo.isWinner(playerOne))
            return playerTwo;
        return null;
    }

    public void displayScore(){
        gameDisplay.displayScore(playerOne, playerTwo);
    }

    public boolean displayWinner(Player player){
        if(Objects.nonNull(player)) {
            gameDisplay.displayWinner(player);
            return true;
        }
        return false;
    }

    public void displayCorruptedPointsPlayerInput(){
        gameDisplay.displayCorruptedPointsPlayerInput();
    }

    public void displayTooLongGame(){
        gameDisplay.displayTooLongGame();
    }

}
