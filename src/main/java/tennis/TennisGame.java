package tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

	private Integer playerOneScore = 0;
	private Integer playerTwoScore = 0;
	
	public String getScore() {
		if(starting()){
			return "Love all";
		}
		if(isDeuce())
		{
			return "Deuce";
		}
		if(hasWiner()){
			return winer()+" wins";
		}
		
		return scoreTable.get(playerOneScore)+","+scoreTable.get(playerTwoScore);
	}

	private String winer() {
		if(isWinPalyerOne())
			return "Player1";
		if(isWinerPlayerTwo())
			return "Player2";
		throw new RuntimeException("No have winer");
	}

	public void playerOneScores() {
		
		playerOneScore++;
	}

	public void playerTwoScores() {
		playerTwoScore++;
	}

	private static final Map<Integer,String> scoreTable = new HashMap();
	{
		scoreTable.put(0,"Love");
		scoreTable.put(1,"Fifteen");
		scoreTable.put(2,"Thirty");
		scoreTable.put(3,"Forty");
		scoreTable.put(4,"Advantage");
	}
	
	private boolean isWinerPlayerTwo() {
		return playerTwoScore>3 &&playerTwoScore > playerOneScore + 1;
	}

	private boolean isWinPalyerOne() {
		return playerOneScore>3 &&playerOneScore > playerTwoScore + 1;
	}

	private boolean hasWiner() {
		return playerOneScore>3 || playerTwoScore>3;
	}

	private boolean isDeuce() {
		return playerOneScore.equals(3)&&playerTwoScore.equals(3);
	}

	private boolean starting() {
		return playerOneScore.equals(0) && playerTwoScore.equals(0);
	}
}
