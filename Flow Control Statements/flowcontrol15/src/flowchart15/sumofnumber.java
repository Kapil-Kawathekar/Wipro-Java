package flowchart15;

import java.util.Scanner;

public class sumofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int r=0;
		while(n>0) {
			 r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);

	}

}
