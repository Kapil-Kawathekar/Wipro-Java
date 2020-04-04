package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public Honda(String mn,String rn,String o,int s){
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

	public int getSpeed() {
		return speed;
	}

	public void cdPlayer() {
		System.out.println("Playing Cd-Player..");
	
	}
	
}
