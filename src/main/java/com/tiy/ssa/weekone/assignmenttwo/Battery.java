package com.tiy.ssa.weekone.assignmenttwo;

public class Battery {

	final float capacity; // in kwh
	float leftOver; // in kwh
	 int powerRating;

	public Battery(float capacity) {
		this.capacity = capacity;
		this.leftOver = capacity;
		
	}

	
	public float charge(float userWantsToCharge)
	{
		
		if (this.leftOver < this.capacity)
		
		{
		this.leftOver = leftOver + userWantsToCharge;
		return this.leftOver;}
		
		return this.capacity;
		
	}

	public float discharge(float userWantsToDischarge)
	
	{
		
		this.leftOver = this.leftOver - userWantsToDischarge;
		
		if (this.leftOver > 0)
		return this.leftOver;
		return 0;
	}

	public float timeLeft(float powerRating)
	{	
		
		float hours = this.leftOver/powerRating;
		
		float minutes = Math.round(hours *60);
		
		return minutes ; // time left to deplete the charge 
		
	}
	


	//@OVERRIDE
//	
//	public String toString ()
//	{
//		return String.format("Battery (%, f, kwh) down to (%,f kwh")
//	}
}
