package flowchart1;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0)
			System.out.println("Positive");
		if(a<0)
			System.out.println("Negative");	
		if(a==0)
			System.out.println("Zero");
		
	}

}
