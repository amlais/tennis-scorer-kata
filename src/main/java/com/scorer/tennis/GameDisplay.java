package com.scorer.tennis;

public class GameDisplay {

    public void displayScore(Player player1, Player player2){

        System.out.printf("Player %s : %s / Player %s : %s \n",
                player1.getName(), player1.getCurrentScore(),
                player2.getName(), player2.getCurrentScore());
    }

    public void displayWinner(Player player){

        System.out.printf("Player %s win the game \n", player.getName());
    }

    public void displayCorruptedPointsPlayerInput(){
        System.out.printf("The game scenario is corrupted\n");
    }
    public void displayTooLongGame(){
        System.out.printf("The game is too long\n");
    }
}
