package com;


public class Palindrome 
{
	public static String evaluate(String expression) {
		int r,sum=0,temp;    
		  int n=121;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
			   return "palindrome";    
		  else    
			   return "not palindrome";    
		
	}

	
	}

