package day11;

public class MathCalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculation m = (a, b)-> a+b;
		MathCalculation sub = (a, b) -> {
			return a-b;
		};
		int add = m.doCalculation(10, 20);
		int subtract = sub.doCalculation(10, 20);
		
		System.out.println(add);
		System.out.println(subtract);
	}

}
