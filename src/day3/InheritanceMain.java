package day3;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketPlayer cp = new CricketPlayer();
		TennisPlayer tp = new TennisPlayer();
		
		cp.setName("Virat Kolhi");
		cp.setAge(34);
		cp.setBattingAverage(56.75f);
		
		System.out.println(cp.getName());
	}

}
