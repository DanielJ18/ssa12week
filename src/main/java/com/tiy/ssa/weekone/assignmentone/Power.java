package com.tiy.ssa.weekone.assignmentone;

public class Power {

	int powerOf, number; 
	
	
	public Power(int powerOf)
	{
		this.powerOf = powerOf;
	}


	public int base(int number) {

			return  (int) Math.pow(number, powerOf);
	}

}
