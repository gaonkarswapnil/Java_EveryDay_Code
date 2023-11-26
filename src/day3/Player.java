package day3;

public class Player {
	String name;
	int age;

	public Player() {
		System.out.println("Hii from Player");
	}
	
	public Player(String name, int age) {
		System.out.println("Hello from Player(String name, int age)");
		this.name = name;
		this.age = age;
	}

	public Player(int age, String name) {
		System.out.println("Hello from Player(int age, String name)");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
