package com.scorer.tennis.utils;

import com.scorer.tennis.Player;

import java.util.Objects;

public class GameDisplay {

    public static void displayScore(Player player1, Player player2){

        System.out.printf("Player %s : %s / Player %s : %s \n",
                player1.getName(), player1.getCurrentScore(),
                player2.getName(), player2.getCurrentScore());
    }

    public static void displayWinner(Player player){
        if(Objects.nonNull(player))
            System.out.printf("Player %s win the game \n", player.getName());
    }

    public static void displayCorruptedPointsPlayerInput(){
        System.out.printf("The game scenario is corrupted\n");
    }
    public static void displayTooLongGame(){
        System.out.printf("The game is too long\n");
    }
}
