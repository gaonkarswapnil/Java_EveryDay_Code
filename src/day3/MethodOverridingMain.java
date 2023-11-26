package day3;

public class MethodOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfflineTraining off = new OfflineTraining("Java", 40, "YCP");
		OnlineTraining on = new OnlineTraining(".Net", 28, "Google");
		
		System.out.println("Module name: "+off.getModuleName());
		off.conductTraining();
		System.out.println(off.getDetails());
		
		System.out.println("Online Lecture: "+on.getModuleName());
		on.conductTraining();
		
	}

}
