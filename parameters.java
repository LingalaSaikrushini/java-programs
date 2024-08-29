package programs;
public class dog
{
	String name;
	String color;
	public dog(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
}
public class parameters {
	public static void main(String[] args)
	 {
		dog d=new dog("bhairav","brown");
		System.out.println(d.name);
		System.out.println(d.color);
	 }

}
