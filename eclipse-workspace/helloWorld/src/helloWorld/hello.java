package helloWorld;
class sample
{
	public void display()
	{
		System.out.print("hello");
	}
}
public class hello extends sample {
	public void display()
	{
		System.out.println("Hi from child cls");
	}
 public static void main(String args[])
 {
	 hello ob=new hello();
	 ob.display();
 }
}
