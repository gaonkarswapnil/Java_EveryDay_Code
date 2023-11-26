package day7;

public class ImplementRunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new ImplementRunnable("Hello", 1000);
		Runnable r2 = new ImplementRunnable("Hii",500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=====Welcome=====");
	}

}
