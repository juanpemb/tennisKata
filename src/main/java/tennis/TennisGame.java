package tennis;

import tennis.resultStrategy.*;

public class TennisGame {

	private Player playerOne;
	private Player playerTwo;
	private final ResultStrategyFactory strategyFactory;

	public TennisGame() {
		playerTwo = new Player(TennisGameConstants.LABEL_PLAYER_2);
		playerOne = new Player(TennisGameConstants.LABEL_PLAYER_1);
		strategyFactory = new ResultStrategyFactory(playerOne,playerTwo);
	}

	public String getScore() {
		return strategyFactory.getStrategy().getScore();
	}

	public void playerOneScore() {
		playerOne.score();
	}

	public void playerTwoScore() {
		playerTwo.score();
	}
}
