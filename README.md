This kata is a tennis game scoring system.

The game take as an input a String of players points and the system
approve the game scenario or disaporove it.

A winner is designed if a scenario is valid.

Each player can have either of these points "0" "15" "30" "40"
- If a player have already 40 points and win the point he wins the game.
- If both players have 40 points the players are deuce.
- If the game os in deuce, the winner of a point will have advantage.
- If the player with advantage wins the ball he wins the game.
- If the player without advantage wins they are back at deuce.

- ## Prequisities
- - Apache Maven
  - Java 21

  ## Install
  'mvn package'

  ## Run
  'java -jar target/tennis-scorer-kata.jar'

  ## Run tests
  'mvn test'
