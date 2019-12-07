package com.archeryScoringApp.mark.domain;

public class Score {

	private int arrowPoint;
	private int endScore;
	private int runningScore;
	private int end;
	private int arrowValue1;
	private int arrowValue2;
	private int arrowValue3;
	
	
	public Score() {
		
	}
	
	public Score(int arrowPoint, int endScore, int runningScore, int end,
			int arrowValue1, int arrowValue2, int arrowValue3) {
		super();
		this.arrowPoint = arrowPoint;
		this.endScore = endScore;
		this.runningScore = runningScore;
		this.end = end;
		this.arrowValue1 = arrowValue1;
		this.arrowValue2 = arrowValue2;
		this.arrowValue3 = arrowValue3;
	}

	public int getArrowPoint() {
		return arrowPoint;
	}

	public void setArrowPoint(int arrowPoint) {
		this.arrowPoint = arrowPoint;
	}

	public int getEndScore() {
		return endScore;
	}

	public void setEndScore(int endScore) {
		this.endScore = endScore;
	}

	public int getRunningScore() {
		return runningScore;
	}

	public void setRunningScore(int runningScore) {
		this.runningScore = runningScore;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getArrowValue1() {
		return arrowValue1;
	}

	public void setArrowValue1(int arrowValue1) {
		this.arrowValue1 = arrowValue1;
	}

	public int getArrowValue2() {
		return arrowValue2;
	}

	public void setArrowValue2(int arrowValue2) {
		this.arrowValue2 = arrowValue2;
	}

	public int getArrowValue3() {
		return arrowValue3;
	}

	public void setArrowValue3(int arrowValue3) {
		this.arrowValue3 = arrowValue3;
	}
	
}
