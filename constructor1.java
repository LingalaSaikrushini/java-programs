package java13;

public class constructor1 {
	int x;
	public constructor1() {
		x=5;
	}
	public static void main(String[] args) {
		constructor1 myConst=new constructor1();
		System.out.println(myConst.x);
	}

}
