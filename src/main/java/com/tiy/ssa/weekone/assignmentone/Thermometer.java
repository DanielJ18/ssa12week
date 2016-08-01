package com.tiy.ssa.weekone.assignmentone;

import org.junit.Test;

public class Thermometer {
	
	int temperature;
	boolean isFahrenheit;
	
	public Thermometer(int temperature, boolean isFahrenheit)
	{
		this.temperature = temperature;
		this.isFahrenheit= isFahrenheit;
		
	}
	
	public Thermometer(int temperature)
	{
		
		this(temperature, true);
		
		
	}@Test

	
	
	//create condition for C2F conversion and F2C
	// false false
	//false true
	// true false 
	//true false
	
	
	public int display(boolean userWantsFahrenheit){

		if (userWantsFahrenheit == this.isFahrenheit)
				
				return this.temperature;
		
		if (this.isFahrenheit && userWantsFahrenheit == false)
		
					
				return ((this.temperature - 32) * 5) / 9;
				
		return -1;
		}
	
	
	
	
	int fahrenheitToCelsius()
	{
		return -1;
	}
	
	int Celsiustofahrenheit()
	{
		return -1;
	}
}
