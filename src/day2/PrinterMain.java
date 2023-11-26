package day2;

public class PrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructor Without Parameter");
		Printer p = new Printer();
		p.print();
		
		System.out.println("Constructor With Parameter");
		p = new Printer("Good Night");
		p.print("*****");
		
	}

}
