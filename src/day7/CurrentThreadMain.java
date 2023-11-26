package day7;

public class CurrentThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		int mainThreadPriority = mainThread.getPriority();
		String name = mainThread.getName();
		System.out.println(name);
		mainThread.stop();
		
	}

}
