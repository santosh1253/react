package helloWorld;

public class str {
  public static void main(String args[])
  {
	  String x="Hello";
	  // the below comment shows that string is immutable
	  // x.append("How are you);
	  // The above statement results in a compile time error
	  x=x.concat(" hi");
	  System.out.println(x);
	  x=x.toLowerCase();
	  System.out.println(x);
	  x=x.toUpperCase();
	  System.out.println(x);
	  x=x.replace('E','a');
	  System.out.println(x);
}
}
 