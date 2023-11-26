package day2;

public class ArrayOfObjectMain {

	private static void printMinorAge(Person[] person) {
		// TODO Auto-generated method stub
		int age;
		for(Person p: person) {
			age = p.getAge();
			if(age<=18) {
				System.out.println(p.getName());
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p[] = new Person[3];
		p[0] = new Person();
		p[1] = new Person("Kunal", 24);
		p[2] = new Person(17, "Omkar");
		
		printMinorAge(p);
	}

}
