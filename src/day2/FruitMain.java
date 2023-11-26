package day2;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("Apple", "Red");
		Fruit f3 = new Fruit("Gauva", "Green");
		
		System.out.println("Fruit Count: "+Fruit.fruitCount);
		System.out.println("Total Fruit count is: "+Fruit.getTotalFruitCount());
		
		for(int i=0; i<=5; i++) {
			Fruit f = new Fruit();
			System.out.println("Fruit Count: "+f.fruitCount);
		}
		System.out.println("Fruit Count: "+f1.fruitCount);
		System.out.println("Total Fruit Count: "+f1.getTotalFruitCount());
	}

}
