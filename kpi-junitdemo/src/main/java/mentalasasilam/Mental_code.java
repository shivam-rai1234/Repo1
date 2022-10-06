package mentalasasilam;


interface Mentalasilam{
	boolean checkmental(boolean b);
	 
	
}

public class Mental_code {
	
	 private boolean operateor(boolean a,Mentalasilam b) 
	 {
		return b.checkmental(a);
	 }
	
	 public static void main(String[] args)
	{
	//before asilam
		Mental_code check=new Mental_code();
		
		Mentalasilam saynamboy1=(boolean a) -> a;
		Mentalasilam abhitayuboy2=(boolean a) -> a;
		Mentalasilam shubhamboy3=(boolean a) -> a;
		Mentalasilam omboy4=(boolean a) -> a;
		Mentalasilam abhishekold1=(boolean a) -> a;
		Mentalasilam gauravold2=(boolean a) -> a;
		Mentalasilam piyushold3=(boolean a) -> a;
		Mentalasilam mashirold4=(boolean a) -> a;
		
		
		System.out.println("Is saynam stable = "+ check.operateor(true,saynamboy1));
		System.out.println("Is abhitayu stable = "+ check.operateor(false,abhitayuboy2));
		System.out.println("Is shubham stable = "+ check.operateor(false,shubhamboy3));
		System.out.println("Is om stable = "+ check.operateor(false,omboy4));
		System.out.println("Is abhishek stable = "+ check.operateor(false,abhishekold1));
		System.out.println("Is gaurav stable = "+ check.operateor(true,gauravold2));
		System.out.println("Is piyush stable = "+ check.operateor(false,piyushold3));
		System.out.println("Is mashir stable = "+ check.operateor(false,mashirold4));
		
		System.out.println();
		System.out.println("recover name after asilam are");
		 
		if( check.operateor(true,saynamboy1)==true) 
		{
			System.out.println("saynamboy1");
		}
		if (check.operateor(false,abhitayuboy2)==true) {
			System.out.println("abhitayuboy2");}
		if(check.operateor(false,shubhamboy3)==true)
		{
			System.out.println("shubhamboy3");
		}
		if(check.operateor(false,omboy4)==true)
		{
			System.out.println("omboy4");
		}
		if(check.operateor(false,abhishekold1)==true)
		{
			System.out.println("abhishekold1");
		}
		if( check.operateor(true,gauravold2)==true) 
		{
			System.out.println("gauravold2");
		}
		if(check.operateor(false,piyushold3)==true)
		{
			System.out.println("piyushold3");
		}
		if(check.operateor(false,mashirold4)==true)
		{
			System.out.println("mashirold4");
		}
	}

}
