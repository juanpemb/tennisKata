package tennis.resultStrategy;


import tennis.Player;
import tennis.TennisGameConstants;

public class DeuceStrategy implements  ResultStrategy {

    private Player playerOne;
    private Player playerTwo;

    public DeuceStrategy(Player playerOne, Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }

    @Override
    public boolean apply() {
        return playerOne.pointInNumber().equals(3)&&playerTwo.pointInNumber().equals(3);
    }

    @Override
    public String getScore() {
        return TennisGameConstants.DEUCE;
    }
}
