package my_defaultPackage;

public class Calculator {
	public static void main(String args[])
	{
		System.out.println("From main Method");
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int floor_div(int a,int b)
	{
		return a%b;
	}
}
