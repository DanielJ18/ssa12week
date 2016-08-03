package com.tiy.ssa.weekone.assignmentone;

public class Power {

	int raisedTo, number; 
	
	
	public Power(int raisedTo)
	{
		this.raisedTo = raisedTo;
	}


	public int base(int number) {

			return  (int) Math.pow(number, this.raisedTo);
	}

}
