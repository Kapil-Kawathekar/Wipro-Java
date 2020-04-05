package abstractclass3;

import java.util.Random;


public class TestInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instrument [] I=new Instrument[10];
		Random random=new Random();
		
		//random.nextInt(max - min + 1) + min
	

		for(int i=1;i<10;i++) {
			int r=	random.nextInt(3 - 1 + 1) + 1;
			if(r==1) 
				I[i]=new Piano(); 
			else if(r==2)
				I[i]=new Flute();
			else if(r==3) 
				I[i]=new Guitar();
			
			I[i].play();
			
		}
		for(int j=1;j<10;j++) {
			if(I[j] instanceof Piano) {
				System.out.println("Instrument Piano is stored at index : "+j);
			}
			if(I[j] instanceof Flute) {
				System.out.println("Instrument Flute is stored at index : "+j);
			}
			if(I[j] instanceof Guitar) {
				System.out.println("Instrument Guitar is stored at index : "+j);
			}
		}
		
	}

}
