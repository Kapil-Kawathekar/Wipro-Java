package arrays3;

import java.util.Scanner;

public class searchnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		int index=0;
		int flag=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Element");
		int s=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(s==a[i]) {
				flag=1;
				index=i;
				break;
			}
				
		}
		if(flag==1)
			System.out.println(index);
		else
			System.out.println("-1");
		
	}

}
