package day3;

public class MethodOverridingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training t;
		t = new OfflineTraining("OOP using Java", 10, "YCP, Mumbai");
		
		OfflineTraining off = (OfflineTraining)t;
		off.setDuration(100);
		off.conductTraining();
		System.out.println(off.getDetails());
		
		t = new OnlineTraining("Node Js", 5, "Zoom");
		System.out.println("Module Name: "+t.getModuleName());
		t.conductTraining();
	}

}
