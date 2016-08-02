package com.tiy.ssa.weekone.assignmenttwo;

public class Battery {

	final float capacity; // in kwh
	float leftOver; // in kwh

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

	
	
	//@OVERRIDE
//	
//	public String toString ()
//	{
//		return String.format("Battery (%, f, kwh) down to (%,f kwh")
//	}
}
