package day1;

public class PlanetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet ourPlanet = new Planet();
		ourPlanet.assignValue("Earth", 1);
		
		Planet biggestPlanet = new Planet();
		biggestPlanet.assignValue("Jupiter", 16);
		
		String ourPlanetInfo = ourPlanet.retrieveValue();
		System.out.println(ourPlanetInfo);
		System.out.println(biggestPlanet.retrieveValue());
	}

}
