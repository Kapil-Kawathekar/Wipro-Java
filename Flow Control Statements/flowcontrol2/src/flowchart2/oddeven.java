package flowchart2;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
