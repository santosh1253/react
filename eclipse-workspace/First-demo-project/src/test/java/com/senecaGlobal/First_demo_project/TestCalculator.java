package com.senecaGlobal.First_demo_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void Addtest() {
		int actual=Calculator.calc(1, 10, 3);
		System.out.println(actual);
		assertEquals(actual,13);
	}
	@Test
	void Subtractiontest() {
		int actual=Calculator.calc(2, 10, 3);
		System.out.println(actual);
		assertEquals(actual,7);
	}
	@Test
	void multest() {
		int actual=Calculator.calc(3, 10, 3);
		System.out.println(actual);
		assertEquals(actual,30);
	}
	@Test
	void Zerotest() {
		int actual=Calculator.calc(0, 10, 3);
		System.out.println(actual);
		assertEquals(actual,0);
	}
	@Test
	void Divtest() {
		int actual=Calculator.calc(4, 10, 3);
		System.out.println(actual);
		assertEquals(actual,3);
	}

	@Test
	void modDivtest() {
		int actual=Calculator.calc(5, 10, 3);
		System.out.println(actual);
		assertEquals(actual,1);
	}

}
