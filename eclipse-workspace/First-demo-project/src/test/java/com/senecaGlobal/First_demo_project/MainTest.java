package com.senecaGlobal.First_demo_project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class MainTest {
	@Test
	void testPositiveNumbersSum() {
		Main ob = new Main();
		int a[] = { 1, 2, 3, 4, 5 };
		int actual = ob.arraySum(a);
		assertEquals(15, actual);

	}

	@Test
	void testNegativeNumbersSum() {
		Main ob = new Main();
		int a[] = { -1, -20, -3, -40, -5 };
		int actual = ob.arraySum(a);
		assertEquals(-69, actual);

	}

	@Test
	void testMixedNumbersSum() {
		Main ob = new Main();
		int a[] = { 1, 2, -3, -4, 5 };
		int actual = ob.arraySum(a);
		assertEquals(1, actual);

	}

	@Test
	void testEmptyNumbersSum() {
		Main ob = new Main();
		int a[] = { 0, 0, 0, 0, 0 };
		int actual = ob.arraySum(a);
		assertEquals(0, actual);
	}

	@Test
	void sortedOrNot() {
		Main ob = new Main();
		int a[] = { 2, 3, 1, 5, 4 };
		Arrays.sort(a);
		assertArrayEquals(a, ob.sort(a));
	}
}
