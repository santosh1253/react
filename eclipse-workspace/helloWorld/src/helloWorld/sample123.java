package helloWorld;

public class sample123{
	private int sec;
	private float avg;
	
	sample123()
	{
		this(5,6.5f);
		
	}
	sample123(int x, float f)
	{
		this.sec=x;
		this.avg=f;
		
	}
	public String toString()
	{
		return String.format("sec are:%s avg is :%s",sec, avg);
	}
	public static void main(String arg[])
	{
		sample123 s=new sample123();
		System.out.println(s);
		sample123 s1=new sample123(10,20.8f);
		System.out.println(s1);
		
	}

}
