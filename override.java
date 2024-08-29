package programs;
class animal
{
	void move()
	{
		System.out.println("im the king of the forest");
	}
}
class dog extends animal
	{
		void move()
		{
			System.out.println("im the fast runner in the forest");
		}
	}
public class override {
	public static void main(String[] args)
	{
		dog d=new dog();
		d.move();
	}

}
