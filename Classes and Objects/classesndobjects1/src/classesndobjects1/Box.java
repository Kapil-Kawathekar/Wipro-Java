package classesndobjects1;

public class Box {
	private int width;
	private int height;
	private int depth;
	private int volume;
	Box(){
		
	}
	Box(int w,int h,int d){
		width=w;
		height=h;
		depth=d;
	}
	public int volume() {
		volume=width*height*depth;
		return volume;
		//	System.out.println("Volume of the box is : "+volume);
	}
	
	
}
