package day11;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting gr1 = () -> "Hello";
		Greeting gr2 = () -> {
			return "Welcome";
		};
		
		String greeting1 = gr1.greeting();
		String greeting2 = gr2.greeting();
		
		System.out.println(greeting1);
		System.out.println(greeting2);
	}

}
