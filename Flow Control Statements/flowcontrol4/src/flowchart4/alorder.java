package flowchart4;

import java.util.Scanner;

public class alorder {
	public static void main(String[] args) {
		System.out.println("Enter two Character");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		if(a>b)
			System.out.println(b+","+a);
		else
			System.out.println(a+","+b);
		
	}
}
