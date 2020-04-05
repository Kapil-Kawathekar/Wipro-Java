package flowchart14;

import java.util.Scanner;

public class checkpornot {

	public static void main(String[] args) {
		if(args.length==0)
			System.out.println("Please enter an integer number");
		
		if(args.length==1) {
		int flag=0;
				int n=Integer.parseInt(args[0]);
				if(n==1 || n==0) {
					flag=1;
				}
				else {
					for(int i=2;i<n;i++) {
						if(n%i==0) {
							flag=1;
							break;
						}
					}
					
					
				}
				if(flag==1) {
					if(n==0 ||n==1)
						System.out.println(n+" is neither prime nor composite");
					else
					System.out.println(n+" is not a prime number");
				}else
					System.out.println(n+" is a prime number");
				
		}
	}

}
