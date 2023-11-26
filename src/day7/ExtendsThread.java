package day7;

public class ExtendsThread extends Thread {
	private String message;
	private int delayTime;
	
	public ExtendsThread(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}

	public void run() {
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
