package programs;

class animal
{
	public void eat()
	{
		System.out.println("animals eat based on their category");
	}
	public void sleep()
	{
		System.out.println("animal sleeps");
	}
	class dog extends animal
	{
		public void eat()
		{
			System.out.println("i will eat flesh ");
		}
		public void sleep()
		{
			System.out.println("i loves to sleep");
		}
	}
	class goat extends animal
	{
		public void eat()
		{
			System.out.println("im a herbivore");
		}
		public void sleep()
		{
			System.out.println("im a pet animal");
		}
	}
}
public class methodo {
	public static void main(String[] args)
	{
		goat g=dog.new goat();
		g.eat();
		g.sleep();
	}

}
