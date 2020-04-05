package flowchart3;

public class numberofarg {
		
	public static void main(String[] args) {
	
		if(args.length==0) {
			System.out.println("No values");
		}
		int n=args.length;
		for(int i=0;i<n;i++) {
			System.out.print(args[i]);
			if(i<n-1)
				System.out.print(",");
		}
	
	}
}
