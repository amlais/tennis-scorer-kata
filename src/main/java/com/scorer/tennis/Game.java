package com.scorer.tennis;

import com.scorer.tennis.enums.GameStatus;
import com.scorer.tennis.utils.GameValidator;


/**
 * Cette classe permet de dérouler un jeu de tennis, evaluer le score du jeu
 * après chaque point marqué et identifier ou pas la fin du jeu et le gagnant eventuel
 */
public class Game {

    private final ScoreCalculator scoreCalculator;
    public Game(ScoreCalculator scoreCalculator){
        this.scoreCalculator = scoreCalculator;
    }

    private String updateRemainingPoints(String remainingPoints){
        return remainingPoints.substring(1);
    }
    private boolean isGameFinished(){
        return scoreCalculator.isGameWon() == GameStatus.WON;
    }

    public boolean play(String remainingPoints){

        if(!GameValidator.isGameValid(remainingPoints)) {
            scoreCalculator.displayCorruptedPointsPlayerInput();
            return false;
        }
        else{
            while(!remainingPoints.isEmpty() && !isGameFinished()){
                scoreCalculator.updateCurrentScore(remainingPoints);
                scoreCalculator.displayScore();
                remainingPoints = updateRemainingPoints(remainingPoints);
            }
            if(!remainingPoints.isEmpty()) {
                scoreCalculator.displayTooLongGame();
                return false;
            }
            Player winner = scoreCalculator.getWinner();
            scoreCalculator.displayWinner(winner);
            return true;
        }
    }
}
