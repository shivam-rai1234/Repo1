package polymorphism;

public class Comptimepoly {
	void show(int num1)
	{
		System.out.println("number " + num1);
	}
	void show(int num1,int num2)
	{
		System.out.println("numbers "+ num1 + num2);
	}
public static void main(String[]arg)
{
	Comptimepoly obj = new Comptimepoly();
	obj.show(4);
	obj.show(40,50);
	
}
}
