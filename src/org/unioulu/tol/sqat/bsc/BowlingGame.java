package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	static int sum = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public int score(){
		
//		for(int i=0; i<frames.size();i++){
//			sum = sum + frameScore(i);
//		}
//		return sum;
		
		return frames.get(0).score() + frames.get(1).score();
	}
	
	public int frameScore(int index) {
		if(index<frames.size()){
			if(frames.get(index).isStrike() || frames.get(index).isSpare())
				return frames.get(index).score()+frames.get(index+1).bonus();
		}
			return frames.get(index).score();
			
	}

	public boolean isNextFrameBonus(){
		Frame currentFrame = frames.get(frames.size()-1);
		if(currentFrame.isSpare() || currentFrame.isStrike()) return true;
		return false;
	}
}
