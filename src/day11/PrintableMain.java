package day11;

public class PrintableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p1 = () -> System.out.println("Hello");
		Printable p2 = () -> System.out.println("Welcome");
		Printable p3 = () -> {
			System.out.println("Hello");
			System.out.println("Welcome");
		};
		
		p1.display();
		p2.display();
		p3.display();
		
	}

}
