package coding;

import java.util.ArrayList;

public class Substring {
	public static void main(String args[])
	  {
	ArrayList<String> al=new ArrayList<>();
	  String x="abcd";
	  for(int i=0;i<x.length();i++)
	  {
		  String res="";
		  for(int j=i+1;j<=x.length();j++)
		  {
			  res=x.substring(i,j);
			  al.add(res);
		  }
		  
	  }
	  System.out.println(al);
	  }
}
