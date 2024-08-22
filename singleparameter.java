package javaprograms;

public class singleparameter {
	public int sum(int x) {
	return x;
	}
	public double sum(double y) {
		return y;
	}
	public static void main(String[] args) {
		singleparameter s=new singleparameter();
		System.out.println(s.sum(5));
		System.out.println(s.sum(10));
		
	}

}
