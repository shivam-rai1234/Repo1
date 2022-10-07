package dateformate;

import java.text.Format;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
public class GetDayNameExample1  
{  
public static void main(String args[]) throws Exception   
{  
//returns a Calendar object whose calendar fields have been initialized with the current date and time  
Calendar cal = Calendar.getInstance();  
//creating a constructor of the SimpleDateFormat class  
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
//getting current date  
System.out.println("Today's date: "+sdf.format(cal.getTime()));  
Format f = new SimpleDateFormat("EEEE");  
String str = f.format(new Date());  
//prints day name  
System.out.println("Day Name: "+str);  
}  
}  


