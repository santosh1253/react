package helloWorld;

public class base {
public static void main(String arg[])
{
	try
	{
		int a=5/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Form Finally block");
	}
}
}
