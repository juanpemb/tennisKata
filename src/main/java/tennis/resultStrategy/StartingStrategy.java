package tennis.resultStrategy;


import tennis.Player;
import tennis.TennisGameConstants;

public class StartingStrategy implements  ResultStrategy {

    private Player playerOne;
    private Player playerTwo;

    public StartingStrategy(Player playerOne, Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }

    @Override
    public boolean apply() {
        return playerOne.isStarting() && playerTwo.isStarting();
    }

    @Override
    public String getScore() {
        return TennisGameConstants.START_GAME;
    }
}
