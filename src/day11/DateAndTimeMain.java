package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateAndTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		LocalDate independence = LocalDate.of(1947, 8, 15);
		System.out.println(independence);
		
//		LocalDate nextDate = date.plusDays(6);
		LocalDate nextDate = date.plus(6, ChronoUnit.MONTHS);
		System.out.println(nextDate);
		
	}

}
