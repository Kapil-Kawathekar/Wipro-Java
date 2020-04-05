package flowchart18;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			if(args.length==0)
				System.out.println("Please enter an integer number");
			if(args.length==1) {
		int n=Integer.parseInt(args[0]);
		int reverse=0,original,r;
		original=n;
		while(n!=0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			
		}
		if(reverse==original)
			System.out.println(original+" is a pallindrome");
		else
		System.out.println(original+" is not a pallindrome");
	}
	}
}
