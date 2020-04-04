package com.automobile;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h=new Honda("Honda 420","WSX55","Prashant",100);
		System.out.println(h.getOwnerName());
		System.out.println(h.getRegistrationNumber());
		System.out.println(h.getModelName());
		System.out.println(h.getSpeed());
		h.cdPlayer();
		
		System.out.println();
		
		Hero hr=new Hero("Hero Hornet","FDS458","Vinay",80);
		System.out.println(hr.getOwnerName());
		System.out.println(hr.getRegistrationNumber());
		System.out.println(hr.getModelName());
		System.out.println(hr.getSpeed());
		hr.radio();
		
		System.out.println();
		Logan l=new Logan("Logan","SDF159","Vishal",110);
		
		System.out.println(l.getOwnerName());
		System.out.println(l.getRegistrationNumber());
		System.out.println(l.getModelName());
		System.out.println(l.getSpeed());
		l.gps();
		
		System.out.println();
		
		Ford f=new Ford("Ford","QWE753","Kapil",112);
		
		System.out.println(f.getOwnerName());
		System.out.println(f.getRegistrationNumber());
		System.out.println(f.getModelName());
		System.out.println(f.getSpeed());
		f.tempControl();
		
	}

}
