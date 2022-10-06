package mentalasasilam;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Functional{
	void print(List test);
}

public class Foreach {
	public static void main(String[] args)
	{
		List<String> food = new ArrayList<String>();
	food.add("samosa");
	food.add("pani puri");
	food.add("maggie");
	food.add("pav bhaji");
	food.add("dosa");
	food.add("biryani");
	
	for(int i=0;i<food.size();i++) 
	{
		System.out.println(food.get(i));
	}
	System.out.println("------------Iterating by passing lambda expression-------------");
	food.forEach(foddie -> System.out.println(foddie));
	}
	

}
