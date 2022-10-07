package dateformate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeDatecheck {
	public static void LocalDateTimeApi() {
	LocalDate date =LocalDate.now();
	System.out.println("the current date is "+date);
	
	LocalTime time=LocalTime.now();
	System.out.println("the current time is "+time);
	
	LocalDateTime current=LocalDateTime.now();
	System.out.println("current date time is "+current);
	
	LocalDate date2=LocalDate.of(1950, 1, 26);
	System.out.println("the republic day :"+date2);
	
	LocalDateTime specificDate=current.withDayOfMonth(24).withYear(2016);
	System.out.println("specific date with "+"current time : "+specificDate);
	

	
	Month month=current.getMonth();
	int day=current.getDayOfMonth();
	int secound=current.getSecond();
	int hour=current.getHour();
	int year=current.getYear();
	System.out.println("Month : "+month+" day :"+day+" secound :"+secound+" hour :"+hour+" year :"+year);
	
	}
public static void main(String args[]) 
{
	LocalDateTimeApi();
}
}
