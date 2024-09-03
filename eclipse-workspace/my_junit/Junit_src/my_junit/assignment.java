package my_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class assignment {

	@Test
	//Creating annotation @Disabled to ignore the test
	@Disabled
	void test() {
		System.out.println("From test() method");
	}
	@Test
	void chechEqual_orNot()
	{
		String a="ABCD";
		String b="ABCD";
		assertEquals(a,b);
	}
	

}
