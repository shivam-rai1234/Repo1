package polymorphism;

interface Checkout{
	abstract void num(int a);
	
	//default method 
	default void add(int a,int b )
	{	int sum=a+b;
		System.out.println("after sum = "+sum);
	}
}
public class Defaultmethod implements Checkout{
	@Override
	public void num(int a) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	public static void main(String args[])
	{
		Defaultmethod d=new Defaultmethod();
		d.num(4);
		d.add(2,3);
	}


	

	

}
