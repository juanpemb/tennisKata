package tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void testNewGameShouldReturnLoveAll(){
		TennisGame game = createScore(0, 0);
		
		assertEquals("Love all", game.getScore());
	}
	
	@Test
	public void testPlayerOneWinsFirstBall(){
		TennisGame game = createScore(1, 0);
		String score = game.getScore();
		
		assertEquals("Fifteen,Love", score);
	}
	
	@Test
	public void testFifteenAll(){
		TennisGame game = createScore(1, 1);
		
		String score = game.getScore();

		assertEquals("Fifteen,Fifteen", score);
	}
	@Test
	public void testPlayerTwoWinsFirstTwoBalls() {
		TennisGame game = createScore(0,2);
		
		String  score = game.getScore();
		
		assertEquals("Love,Thirty",score);
	}

	@Test 
	public void testPlayerOneWinsFirstThreeBalls(){
		TennisGame game = createScore(3	,0);
		
		String score = game.getScore();
		
		assertEquals("Forty,Love", score);
	}
	
	@Test
	public void testPlayersAreDeuce() {
		TennisGame game = createScore(3, 3);
		
		String score = game.getScore();
		
		assertEquals("Deuce", score);
	}
	
	@Test
	public void testPlayerOneWinsGame(){
		TennisGame game = createScore(3, 2);
		
		game.playerOneScores();
		
		assertEquals("Player1 wins",game.getScore());
	}
	
	@Test
	public void testPlayerTwoWinsGame(){
		TennisGame game = createScore(0,3);
		game.playerTwoScores();
		
		String score = game.getScore();

		assertEquals("Player2 wins", score);
	}
	
	private TennisGame createScore(int playerOne, int playerTwo) {
		TennisGame game = new TennisGame();
		for (int i = 0; i < playerOne; i++) {
			game.playerOneScores();
		}
		for (int i = 0; i < playerTwo; i++) {
			game.playerTwoScores();
		}
		return game;
	}
}
