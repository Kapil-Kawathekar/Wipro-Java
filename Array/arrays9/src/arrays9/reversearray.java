package arrays9;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=4) {
			System.out.println("Please enter 4 integer numbers");
		}
		if(args.length==4) {
		int [][]a=new int [2][2];
		int [][]b=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=Integer.parseInt(args[2*i+j]);
			}
		}
		System.out.println("The given array is : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int mr=2;
		int mc=2;
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				b[mr-1-i][mc-1-j]=a[i][j];
			}
		}
		System.out.println("The Reverse of the array is : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}

}
