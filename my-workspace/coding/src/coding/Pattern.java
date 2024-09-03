package coding;

public class Pattern {
	public static void main(String args[]) {
		System.out.println(LongestSubstring("abcabcbb"));
	}

	public static int LongestSubstring(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			String res = "";
			for (int j = i + 1; j <= s.length(); j++) {
				res = s.substring(i, j);
				System.out.print(res+" ");

			}
			String f = "";
			for (int j = 0; j < res.length(); j++) {
				if (!f.contains(String.valueOf(res.charAt(j)))) {
					f += res.charAt(j);
				} else
					break;
			}
			System.out.println("f:"+f);
				c = Math.max(c, f.length());
				System.out.print(c+" ");
		}
		return c;
	}
}
