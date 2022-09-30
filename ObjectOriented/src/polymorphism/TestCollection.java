package polymorphism;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();

		list.add("hello");
		list.add("I accept only string value because of string data type");
		list.add("z");
		//list2.add(1);
		//list2.add("I can accept any data type value because while creating me data type is not define");
		System.out.println(list);
		System.out.println(list2);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)=="z")
			System.out.println(i);
		}
		int j;
		for ( j=0; j<10; j++)
		{
			list2.add(j);
			
		}
		System.out.println(list2);
	}

}
