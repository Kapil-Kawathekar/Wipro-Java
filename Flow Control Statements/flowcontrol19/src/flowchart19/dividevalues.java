package flowchart19;

public class dividevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0,i=1;
		while(i<1000 && counter<5) {
			if(i%2==0 && i%3==0&&i%5==0) {
				System.out.println(i);
				counter++;
			}
			i++;
		}
				
	}

}
