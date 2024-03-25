package com.scorer.tennis;

public class Player {

    private final String name;

    private String currentScore = "0";

    public Player(String name){
        this.name = name;
    }
    public void addPoint(){
        switch(currentScore){
            case "0":
                currentScore = "15";
                break;
            case "15":
                currentScore = "30";
                break;
            case "30":
                currentScore = "40";
                break;
            case "40":
                currentScore = "A";
                break;
            case "A":
                currentScore = "V";
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
    public String getName(){
        return this.name;
    }
    
    public String getCurrentScore(){
        return this.currentScore;
    }
    public void setCurrentScore(String currentScore){
        this.currentScore = currentScore;
    }
    public boolean isWinner(Player playerTwo){
        if(this.getCurrentScore().equals("A") &&
                isPlayerTwoScoreIsLessThanFourthy(playerTwo))
            return true;

        if(this.getCurrentScore().equals("V")
                && !playerTwo.getCurrentScore().equals("A")) {
            return true;
        }

        rederessScores(playerTwo);
        return false;
    }

    private void rederessScores(Player playerTwo) {
        if(this.getCurrentScore().equals("A")
                && playerTwo.getCurrentScore().equals("A")) {
            this.setCurrentScore("40");
            playerTwo.setCurrentScore("40");
        }
    }

    private boolean isPlayerTwoScoreIsLessThanFourthy(Player playerTwo) {
        return !playerTwo.getCurrentScore().equals("A") &&
                !playerTwo.getCurrentScore().equals("V") &&
                Integer.parseInt(playerTwo.getCurrentScore()) < 40;
    }
}
