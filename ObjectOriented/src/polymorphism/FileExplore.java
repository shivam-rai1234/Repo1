package polymorphism;

import java.util.Scanner;

public class FileExplore {
public static void main(String args[])
{
	 
	 try(Scanner T1= new Scanner(System.in);Scanner T2= new Scanner(System.in);
			 Scanner T3= new Scanner(System.in);)
	 {
         int sum = T1.nextInt()+T2.nextInt()+T3.nextInt();
         System.out.println("The result is = " +sum);
         
         int multi=T1.nextInt()*T2.nextInt()*T3.nextInt();
         System.out.println("the result is = " +multi);
         
         
	 }
	 catch (ArithmeticException e) {
         
         System.out.println("Arithmetic Exception");
	 }
	 finally
	 {
         
         System.out.println(" ");
}
}
}
