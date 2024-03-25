package com.scorer.tennis.utils;

public class GameValidator {
    /**
     * This method avoid useless GameComputationof invalid scenario
     * @param playerPoints the points scored by players
     *
     */
   public static boolean isGameValid(String playerPoints){

       if(playerPoints.isEmpty())
           return false;

       long charsNumber = getCharsNumber(playerPoints);

       if((charsNumber == 1 && playerPoints.length() == 4)
            || (charsNumber == 2 && playerPoints.length() > 4))
           return true;
       if(charsNumber == 1 || charsNumber > 2)
           return false;

       return false;
   }

    private static long getCharsNumber(String playerPoints) {
       return playerPoints
               .chars()
               .distinct()
               .count();
    }
}
