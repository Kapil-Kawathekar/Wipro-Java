package com.wipro.automobile.ship;

public class Compartment {
	
	private int height;
	private int width;
	private int breadth;
	
	Compartment(int height,int width,int breadth){
		super();
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	@Override
	public String toString() {
		return "[ Height : "+height+" Width : "+width+" Breadth : "+breadth+" ]";
	}
}
