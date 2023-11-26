package day7;

public class ImplementRunnable implements Runnable {
	private String message;
	private int delayTime;
	
	public ImplementRunnable(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println("Simple thread works..");
		for(int i=1; i<=10; i++) {
			System.out.println(message);
			
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
