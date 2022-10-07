package thread;

class StaticPervvariable {
	static int a=10;
	static int b;
	
	static{
		System.out.println("Static block initialized");
		b=a*4;
		
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		System.out.println("value of a : "+a);
		System.out.println("value of b : "+b);
	}
}
