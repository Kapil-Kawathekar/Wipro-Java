package flowchart12;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1)
			flag=1;
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			
			
		}
		if(flag==1)
			System.out.println("false");
		else
			System.out.println("true");
		

	}

}
