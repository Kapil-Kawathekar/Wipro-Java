package arrays4;

import java.util.Scanner;

public class asciichar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of ASCII values you want to enter ");
		int n=sc.nextInt();
		int []a=new int[n];
		int index=0;
		int flag=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the ASCII values");
			a[i]=sc.nextInt();
		}	
		
		for(int i=0;i<n;i++) {
			System.out.print(" "+(char)(a[i]));
		}
		
	}

}
