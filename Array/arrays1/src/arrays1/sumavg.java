package arrays1;

import java.util.Scanner;

class sumavg{
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Sum is "+sum +" and "+"Average is "+avg);
		
		
	}
	
	
}