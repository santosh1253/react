package coding;

public class Strings {
  public static void main(String args[])
  {
	  int n=5;
	  for (int i = 0; i < n-1; i++) {
          for (int j = 0; j < (n - i - 1); j++) {
              System.out.print(" ");
          }
          for (int j = 0; j <= i; j++) {
              if (j == 0 || j == i ) {
                  System.out.print("* ");
              } else {
                  System.out.print("  "); // space between hollow part
              }
          }
          System.out.println();
      }
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				if(i==n || i==j || j==1)
				{
				System.out.print("*"+" ");
				}
				else
				   System.out.print("  ");	
			}
			System.out.println();
		}
	 
  }
}
