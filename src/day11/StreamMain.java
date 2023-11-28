package day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> allNumber = Arrays.asList(34,43,54,23,23);
		
		Stream<Integer> intStream= allNumber.stream();
		
		Consumer<Integer> intConsumer = num -> System.out.println(num*2);
		intStream.forEach(intConsumer);
		
	}		

}
