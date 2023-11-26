package day7;

public class ExtendsThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new ExtendsThread("Hello", 1000);
		Thread t2 = new ExtendsThread("Hii", 500);
		t1.start();
		t2.start();
	}

}
