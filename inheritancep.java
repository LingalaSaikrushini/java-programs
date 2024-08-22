package javaprograms;
 class animal {
	public void eat() {
		System.out.println("animals eat food");
	}
class dog extends animal{
		public void sleep() {
			System.out.println("dog is carnivore");
		}
	}
 public class inheritancep{
	public static void main(String[] args) {
		dog d1=new dog();
		d1.sleep();
	}
}
}
