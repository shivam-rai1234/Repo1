package com;

public class Prime {
	public static String isPrime(int n) {  
	       if (n <= 1) {  
	           return "not prime";  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return "not Prime";  
	           }  
	       }  
	       return "prime";  
	   }  

}
