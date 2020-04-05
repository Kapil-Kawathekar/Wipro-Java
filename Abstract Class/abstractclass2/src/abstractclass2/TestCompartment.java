package abstractclass2;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we are not creating the object of abstract class 
		//we are just declaring the array of type compartment
		//Like int [] a=new int [size]
		Compartment [] c=new Compartment[10];
		Random random=new Random();
		
		//random.nextInt(max - min + 1) + min
	

		for(int i=1;i<10;i++) {
			int r=	random.nextInt(4 - 1 + 1) + 1;
			if(r==1) 
				c[i]=new FirstClass(); 
			else if(r==2)
				c[i]=new Ladies();
			else if(r==3) 
				c[i]=new General();
			else if(r==4)
				c[i]=new Luggage();
			
		System.out.println(	c[i].notice());
			
		}
		
		
	}

}
