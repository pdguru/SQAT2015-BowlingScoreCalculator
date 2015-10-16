package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	BowlingGame game;
	
	@Before
	public void setup(){
	game = new BowlingGame();	
	}
	
	@Test
	public void testGameAtStart() {
		
		//arrange 
		Frame frame1 = new Frame(0, 0);
		game.addFrame(frame1);
		//act 
		//assert
		assertEquals(0, frame1.score());
	}

}
