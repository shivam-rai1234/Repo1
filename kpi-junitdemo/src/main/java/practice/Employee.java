package practice;

public class Employee implements Salary,Leaves{

	@Override
	public int no_of_day() {
		// TODO Auto-generated method stub
		
		return 5;
	}

	@Override
	public int amount() {
		// TODO Auto-generated method stub
		System.out.println("next example");
		return 10000;
	}
	

	@Override
	public double gst() {
		// TODO Auto-generated method stub
		return 5.6;
	}
public static void main(String args[]) {
	Employee a= new Employee();
	a.amount();
}


}
