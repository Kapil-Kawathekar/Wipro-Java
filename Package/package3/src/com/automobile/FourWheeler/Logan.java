package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
	
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public Logan(String mn,String rn,String o,int s){
	modelName=mn;
	registrationNumber=rn;
	speed=s;
	ownerName=o;
	
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return modelName;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return registrationNumber;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return ownerName;
	}

	public void gps() {
		System.out.println("Turning on GPS");
	}
	public int getSpeed() {
		return speed;
	}
}
