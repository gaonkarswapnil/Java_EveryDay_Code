package day3;

public class CricketPlayer extends Player{
	private float battingAverage;

	
	public CricketPlayer() {
		System.out.println("Hello from CricketPlayer()");
	}


	public CricketPlayer(String name, int age, float battingAverage) {
		super(name, age);
		System.out.println("Hello from CricketPlayer(String name, int age, float battingAverage)");
		this.battingAverage = battingAverage;
	}


	public float getBattingAverage() {
		return battingAverage;
	}


	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}
	
}
