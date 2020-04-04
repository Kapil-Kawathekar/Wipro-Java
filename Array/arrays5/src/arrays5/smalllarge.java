package arrays5;

import java.util.Arrays;
import java.util.Scanner;

public class smalllarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values");
			a[i]=sc.nextInt();
		}
		//Arrays.sort(a);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Smallest 2 numbers are "+a[0]+" "+a[1]);
		System.out.println("Largest 2 numbers are "+a[n-2]+" "+a[n-1]);
		
		
		
	}

}
