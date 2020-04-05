package flowchart16;

public class floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) {
			System.out.println("Please enter an integer number");
		}
		if(args.length==1) {
		int n=Integer.parseInt(args[0]);
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
		
		}
		
		
		//Using While Loop
		/*int n=Integer.parseInt(args[0]);
		int i=0,j;
		while(i<n) {
			 j=0;
			while(j<=i)
			{
				System.out.print("*"+" ");
				j++;
			}
			System.out.println("");
			i++;
		}
		*/
		
	}

}
