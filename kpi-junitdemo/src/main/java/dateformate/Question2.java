package dateformate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Question2 {
	public static void checkingChronoEnum()
	{
		
		try  
		{  
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);  
		Date date= sdf.parse("07/10/2030");  
		
		sdf.applyPattern("EEEEE, d MMM yyyy");  
		
		String str = sdf.format(date);  
		
		System.out.println(str);  
		System.out.println();
		
		
		 
		System.out.println("date on wednesday is 09-oct-2030");
		
		
		}  
		catch (Exception e)  
		{  
		e.printStackTrace();  
		}   
	}
	public static void main (String args[]) {
		checkingChronoEnum();
	}
}
