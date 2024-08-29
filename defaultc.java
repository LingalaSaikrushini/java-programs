package programs;
class cat
{
	String name;
	int age;
	public cat(String name,int age)
	{
		this.name="unknown";
		this.age=0;
	}
}
public class defaultc {
	public static void main(String[] args)
	{
		cat c=new cat();
		System.out.println(c.name);
		System.out.println(c.age);
	}

}
