package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeTest {
	 @Test
     public void evaluatesExpression() 
	 {
		Prime n=new Prime();
		String s=n.isPrime(5);
		 assertEquals("prime",s);
		
	 }

}
