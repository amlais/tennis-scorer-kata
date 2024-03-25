package com.scorer.tennis;

import com.scorer.tennis.enums.GameStatus;
import com.scorer.tennis.utils.GameDisplay;

import java.util.Objects;

public class ScoreCalculator {

    private final Player playerOne;

    private final Player playerTwo;


    public ScoreCalculator(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
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

    public Player getPlayerOne(){
        return playerOne;
    }

    public Player getPlayerTwo(){
        return playerTwo;
    }

    public Player getWinner(){
        if(playerOne.isWinner(playerTwo))
            return playerOne;
        if(playerTwo.isWinner(playerOne))
            return playerTwo;
        return null;
    }

}
