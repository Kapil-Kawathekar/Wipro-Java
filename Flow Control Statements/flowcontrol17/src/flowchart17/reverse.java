package flowchart17;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		while(n!=0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		System.out.println(reverse);
		
	}

}
