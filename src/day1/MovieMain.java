package day1;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.setTitle("Avengers");
		m.setGenre("Action");
		m.setYear(2012);
		
		System.out.println("Movie \nTitle: "+m.getTitle());
		System.out.println("Year: "+m.getYear());
		System.out.println("Genre: "+m.getGenre());
	}

}
