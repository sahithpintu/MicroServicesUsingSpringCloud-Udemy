package com.in28minutes.microservices.bean;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	
	protected LimitConfiguration() {
		
		// TODO Auto-generated constructor stub
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	

}
