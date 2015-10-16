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
	}

	@Test
	public void testFrameTwoAtFourFive() {

		//arrange 
		Frame frame = new Frame(4, 5);
		//act 
		game.addFrame(frame);
		//assert
		assertEquals(9, frame.score());
		assertEquals(14, game.score());
	}

	@Test
	public void testFrameThreeWithSpare() {

		//arrange 
		Frame frame = new Frame(6, 4);
		//act 
		game.addFrame(frame);
		//assert
		assertEquals(10, frame.score());
		assertEquals(true, game.isNextFrameBonus());

	}

	@Test
	public void testFrameFourForThirdsBonus() {

		//arrange 
		Frame frame = new Frame(5,5);
		//act 
		game.addFrame(frame);
		//assert
		assertEquals(10, frame.score());
		assertEquals(true, game.isNextFrameBonus());
	}

	@Test
	public void testFrameFiveForStrike(){
		//arrange 
		Frame frame = new Frame(10,0);
		//act 
		game.addFrame(frame);
		//assert
		assertEquals(10, frame.score());
		assertEquals(true, frame.isStrike());
		assertEquals(true, game.isNextFrameBonus());
	}

}
