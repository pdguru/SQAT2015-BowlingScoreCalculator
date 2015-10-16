package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	Frame currentFrame;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		if(isNextFrameBonus()){
			
		}
	}
	
	public int score(){
		int sum = 0;
		for(int i=0; i<frames.size();i++){
			sum = sum + frames.get(i).score();
		}
		return sum;
	}
	
	public boolean isNextFrameBonus(){
		 currentFrame = frames.get(frames.size());
		if(currentFrame.isSpare() || currentFrame.isStrike()) return true;
		return false;
	}
}
