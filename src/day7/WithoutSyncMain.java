package day7;

public class WithoutSyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageWithoutSync msg = new MessageWithoutSync("Tomorrow late comers must bring chocolates");
		
		Thread t1 = new MessageWithoutSyncThreadImpl(msg);
		Thread t2 = new MessageWithoutSyncThreadImpl(msg);
		t1.start();
		t2.start();
	}

}
