package practice;



public class Constructor_overloading extends Trying implements SimpleInterface,FunctionalInterfacenew{
	
	@Override
	String name() {
		// TODO Auto-generated method stub
		return "hero";
	}
	@Override
	public int car() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bike() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public int oneonly(int x, int y) {
		return 9;
		// TODO Auto-generated method stub
	
	}
	
	

	Constructor_overloading(){
		System.out.println("default type constructor");
		
	}
	Constructor_overloading(int c){
		System.out.println("constructor with different argument  type int ");
		
	}
	Constructor_overloading(String a){
		System.out.println("This is over loading method and constructor with differnt argument");
		
	}
	
	public static void main(String args[]) {
		Constructor_overloading a=new Constructor_overloading();
		Constructor_overloading b=new Constructor_overloading(1);
		Constructor_overloading c=new Constructor_overloading("start");
		//FunctionalInterfacenew addition=(int x,int y) -> x+y; this is lambda funtion we can also create functional interface with lambda function.
	}
	
	
	
}
