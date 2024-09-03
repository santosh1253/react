package helloWorld;
import java.util.*;
public class printDate {
public static void main(String args[])
{
	int arr[]=new int[5];
	Arrays.fill(arr,0);
	System.out.println(Arrays.toString(arr));
	System.out.println(printValues(1,2,34));
}
public static int printValues(int... value)
{
	int sum=0;
	for(int v:value)
	{
		sum+=v;
	}
	return sum;
}
}
