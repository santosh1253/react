package coding;

public class Snippet {
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		String res="";
		for(int i=0;i<s.length();i++) {
			
			if(!res.contains(String.valueOf(s.charAt(i))) && String.valueOf(s.charAt(i))!=" ")
				res+=s.charAt(i);
	  }
		System.out.println(res);
		if(res.length()==26)
			 System.out.println("Panagram");
	  
		
		
		
		
//		StringBuffer sb=new StringBuffer("aaabbccc");
//		StringBuffer res=new StringBuffer();
//		int c=1;
//		for(int i=0;i+1<sb.length();i++)
//		{
//			if(sb.charAt(i)==sb.charAt(i+1))
//			{
//				c++;
//			}
//			else
//			{
//				res.append(sb.charAt(i));
//			    res.append(c);
//			    c=1;
//			}
//			
//		}
//		res.append(sb.charAt(sb.length()-1));
//		res.append(c);
//		System.out.println(res);
		
	}
}

