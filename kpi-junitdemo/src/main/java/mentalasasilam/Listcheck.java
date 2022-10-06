package mentalasasilam;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Functional1{
	void print(Listcheck test);
}

public class Listcheck {
	public static void main(String[] args)
	{   
		Listcheck listcheck=new Listcheck();
		Listcheck listcheck3=new Listcheck();
		Listcheck listcheck4=new Listcheck();
		List<Listcheck> Shiva = new ArrayList<Listcheck>();
		Shiva.add(listcheck);
		Shiva.add(listcheck);
		Shiva.add(listcheck);
		
		
		Shiva.forEach(i -> System.out.println(i));
		Functional a= i ->System.out.println(i);
		System.out.println(a);
		
	
	}
}
