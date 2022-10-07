package dateformate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {
	
	public static void checkingChronoEnum()
	{
		LocalDate date =LocalDate.now();
		System.out.println("curent date is :"+date);
		
		LocalDate year=date.plus(2,ChronoUnit.YEARS);
		System.out.println("next to the next year is :"+year);
		
		LocalDate week=date.plus(1,ChronoUnit.WEEKS);
		System.out.println("next week is :"+week);
		
		LocalDate month=date.plus(1,ChronoUnit.MONTHS);
		System.out.println("next month is :"+month);
		
		LocalDate decade=date.plus(1,ChronoUnit.DECADES);
		System.out.println("next decade is :"+decade);
		
		
	}
	public static void main (String args[]) {
		checkingChronoEnum();
		
	}
}
