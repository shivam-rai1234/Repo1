package dateformate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
	
	public static void checkingAdjusters() {
		
		LocalDate date=LocalDate.now();
		System.out.println("the current date is :"+date);
		
		LocalDate dayofnextmonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("first day of next month is :"+dayofnextmonth);
		
		LocalDate nextsaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(" next saturday from now is : "+nextsaturday);
		//first day of current month
		LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(" first day of moth is :"+ firstDay);
		
	}
public static void main(String args[])
{
	checkingAdjusters() ;
	}
}
