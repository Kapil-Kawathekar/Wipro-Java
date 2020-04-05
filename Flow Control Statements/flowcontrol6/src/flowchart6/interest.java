package flowchart6;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			System.out.println("Please enter Gender and age");
		if(args.length==2) {
			int age=Integer.parseInt(args[1]);
			String gender=args[0];
			if(gender.equals("Female") && age>=1 && age<=58)
				System.out.println("8.2%");
			else if(gender.equals("Female") && age>=59 && age<=100)
				System.out.println("9.2%");
			
			else if(gender.equals("Male") && age>=1 && age<=58)
				System.out.println("8.4%");
			else if(gender.equals("Male") && age>=59 && age<=100)
				System.out.println("10.5%");
			
		}
		
	}

}
