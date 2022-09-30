package com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PelindromeTest {
	 

    @Test
    public void evaluatesExpression()
	{
		Palindrome n=new Palindrome();
		String num=n.evaluate("121");
		assertEquals("palindrome",num);
		
		

	}

}
