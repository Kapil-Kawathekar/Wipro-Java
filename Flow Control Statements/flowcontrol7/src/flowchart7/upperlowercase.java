package flowchart7;

import java.util.Scanner;

public class upperlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Character");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>=97 && a<=122) {
			System.out.println(a+"->"+Character.toUpperCase(a));
			
		}
		else if(a>=65 && a<=90) {
			System.out.println(a+"->"+Character.toLowerCase(a));
			
		}
		
		
	}

}
