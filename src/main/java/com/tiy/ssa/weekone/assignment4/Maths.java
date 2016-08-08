package com.tiy.ssa.weekone.assignment4;

public class Maths {
	
	
	
	public static int log2(int number)
	{
		  
		int i = 0 ;
		for ( ; number >=2; i++) {
			
			number = number/2;
						
		}
		
		return i;
	}
	
	
		
		public static int log3(int number)
		{
			
			int i = 0 ;
			
			while (number >=3)
			{
				number = number/3;
				i++;
			}
			
			return i; // number of times the loop went through 
			
		}
		
	}
	

