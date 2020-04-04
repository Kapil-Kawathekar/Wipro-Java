package arrays7;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the values");
			a[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<n;i++) {
			if(a[i]!='*') {
				b[k]=a[i];
				k++;
			}
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]='*';
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(" "+b[i]);
		//	a[i]=sc.nextInt();
		}
		
	}

}
