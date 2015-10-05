QUnit.test( "add a empty string", function( assert ) {
  assert.equal(startTheGame(),"All in love","the score when staring should be ´All in love");  
});

QUnit.test( "player 1 score first ball", function( assert ) {
  assert.equal(playerOneScore(),"fifteen,love","the score when player win the first point is 'fifteen,love'");  
});