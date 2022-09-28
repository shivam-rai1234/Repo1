package polymorphism;

public class Runtimepol {
	void run() {System.out.println("run time");} 
}
class Car extends Runtimepol{
	void run()
	{System.out.println("run time poly");}
}
class Bike extends Runtimepol{
	void run()
	{System.out.println("run 2 time poly");}



public static void main(String args[]) {
	Runtimepol a= new Car();
	a.run();
	Runtimepol b=new Bike();
	b.run();
}
	
}
