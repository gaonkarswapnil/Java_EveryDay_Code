package day2;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		name = "Swapnil";
		age = 23;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(int age, String name) {
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
