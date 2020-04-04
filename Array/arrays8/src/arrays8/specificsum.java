package arrays8;

import java.util.Scanner;

public class specificsum {

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
		int indexsix=0,indexseven=0;
		int counters=0,counterse=0;
		for(int i=0;i<n;i++) {
			if(a[i]==6 && counters==0) {
				indexsix=i;
				counters++;
			}
			else if(a[i]==7 &&counterse==0) {
				indexseven=i;
				counterse++;
			}
			
		}
		if(counters==1 && counterse==1) {
			for(int i=indexsix;i<=indexseven;i++) {
				a[i]=0;
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}
