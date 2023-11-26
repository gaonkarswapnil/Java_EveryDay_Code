package day3;

public class TennisPlayer extends Player {
	private int aces;

	public TennisPlayer() {
		System.out.println("Hello from TennisPlayer()");
	}

	public TennisPlayer(String name, int age, int aces) {
		super(name, age);
		System.out.println("Hello from TennisPlayer(String name, int age, int aces)");
		this.aces = aces;
	}

	public int getAces() {
		return aces;
	}

	public void setAces(int aces) {
		this.aces = aces;
	}
	
}
