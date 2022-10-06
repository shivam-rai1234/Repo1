package Oops;
//parent 1 extends parent 2 which is v
//parent 1 is child for vehicles(level 2)
public abstract class Car extends Vehicles {

	@Override
	int tyretype() {
		String tubeless = null;
		// TODO Auto-generated method stub
		
		int n = 0;
		if(n>6) {
		return 564;}
	}

	@Override
	String steeringtype() {
		String electric = null;
		// TODO Auto-generated method stub
		return electric;
	}

	@Override
	int seatnumber() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	abstract String segment();
	abstract String brand();
	
}
