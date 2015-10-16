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
		Frame frame1 = new Frame(1, 4);
		//act 
		game.addFrame(frame1);
		//assert
		assertEquals(5, frame1.score());
		assertEquals(5, game.score());
	}
	
	@Test
	public void testFrameTwoAtFourFive() {
		
		//arrange 
		Frame frame2 = new Frame(4, 5);
		//act 
		game.addFrame(frame2);
		//assert
		assertEquals(5, frame2.score());
		assertEquals(14, game.score());
	}

}
