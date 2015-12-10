package tennis.resultStrategy;

import tennis.Player;

public class ResultStrategyFactory {
    private final ResultStrategy startingStrategy;
    private final ResultStrategy deuceStrategy;
    private final ResultStrategy winnerStrategy;
    private final ResultStrategy defaultStrategy;

    public ResultStrategyFactory(Player playerOne, Player playerTwo){
        startingStrategy = new StartingStrategy(playerOne,playerTwo);
        deuceStrategy = new DeuceStrategy(playerOne,playerTwo);
        winnerStrategy = new WinnerStrategy(playerOne,playerTwo);
        defaultStrategy = new DefaultStrategy(playerOne,playerTwo);
    }

    public ResultStrategy getStrategy() {
        if(startingStrategy.apply()){
            return startingStrategy;
        }
        if(deuceStrategy.apply())
        {
            return deuceStrategy;
        }
        if(winnerStrategy.apply()){
            return winnerStrategy;
        }
        return defaultStrategy;
    }
}
