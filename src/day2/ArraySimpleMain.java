package day2;

public class ArraySimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[5];
		number[0] = 10;
		number[1] = 7;
		number[2] = 18;
		number[3] = 45;
		number[4] = 11;
		
		System.out.println("Printing array using normal for");
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+"\t");
		}
	
		
		int numberList[] = {10, 34, 13, 35, 65};
		System.out.println("\nPrinting array using foreach");
		for(int num: numberList) {
			System.out.print(num+"\t");
		}
	}

}
