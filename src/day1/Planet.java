package day1;

public class Planet {
	private String name;
	private int moons;
	
	public void assignValue(String nm, int mn) {
		name = nm;
		moons = mn;
	}
	
	public String retrieveValue() {
		String planetInfo = name + " " + moons;
		return planetInfo;
	}
}
