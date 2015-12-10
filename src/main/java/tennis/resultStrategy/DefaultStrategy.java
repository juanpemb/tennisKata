package tennis.resultStrategy;


import tennis.Player;
import tennis.TennisGameConstants;

public class DefaultStrategy implements  ResultStrategy {

    private Player playerOne;
    private Player playerTwo;

    public DefaultStrategy(Player playerOne, Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }

    @Override
    public boolean apply() {
        return true;
    }

    @Override
    public String getScore() {
        return String.format("%s,%s", playerOne.getScore(), playerTwo.getScore());
    }
}
