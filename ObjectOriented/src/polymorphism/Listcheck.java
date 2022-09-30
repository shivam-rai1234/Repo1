package polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Listcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		//System.out.println(list);
	
		Set<String> set=new HashSet<String>();
		Set set2=new HashSet();
		set.add("a");
		set.add("a");
		//System.out.println(set);
		Map<String, Integer> shi=new HashMap<String, Integer>();
		shi.put("shivam",100);
		shi.put("saynam",200);
		shi.put("abhitayu",300);
		shi.put("abhishek",400);
		shi.put("saynam",300);
		shi.get("saynam");//get method use to get the value from the key
		System.out.println(shi);
		System.out.println(shi.get("saynam"));
		
	}	
		

}
