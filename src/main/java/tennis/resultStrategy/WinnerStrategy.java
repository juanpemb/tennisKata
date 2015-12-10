package tennis.resultStrategy;

import tennis.Player;
import tennis.TennisGameConstants;


public class WinnerStrategy implements ResultStrategy{


    private final Player playerOne;
    private final Player playerTwo;

    public WinnerStrategy(Player playerOne, Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }

    @Override
    public boolean apply() {
        return winner();
    }


    @Override
    public String getScore() {
        return winnerName()+ TennisGameConstants.WINS;
    }

    private boolean winner() {
        if(playerOne.iWiner(playerTwo))
            return true;
        if(playerTwo.iWiner(playerOne))
            return true;
        return false;
    }

    private String winnerName() {
        if(playerOne.iWiner(playerTwo))
            return playerOne.getName();
        if(playerTwo.iWiner(playerOne))
            return playerTwo.getName();
        throw new RuntimeException("Not winner yet!!");
    }

}
