package javaprograms;

public class methodoverloading {
	public int sum(int x,int y) {
		return(x+y);
	}
	public double sum(double x,double y) {
		return(x+y);
	}
public static void main(String[] args) {
	methodoverloading s=new methodoverloading();
	System.out.println(s.sum(5,10));
	System.out.println(s.sum(10,3.0));
	
}
}
