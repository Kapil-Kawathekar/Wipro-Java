package classndobjects3;

import java.util.Scanner;

public class Patient {
		
	private String patientName;
	private double weight;
	private double height;
	
	Scanner sc= new Scanner(System.in);
	
	public double computeBMI() {
		System.out.println("Enter the weight in kgs. ");
		weight=sc.nextDouble();
		System.out.println("Enter the height in meter. ");
		height=sc.nextDouble();
		
		return weight/(height*height);
		
		
	}
	
	
	
	
}
