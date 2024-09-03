package com.senecaGlobal.First_demo_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class primeTest {
	@BeforeEach
	void display() {
		System.out.println("Before executing test case");
	}

	@AfterEach
	void show() {
		System.out.println("After executing test case");
	}

	@Test
	void testPositiveNumber() {
		arrayExm ob = new arrayExm();
		assertEquals(1, ob.isprime(5));
	}

	@Test
	void testNegativeNumber() {
		arrayExm ob = new arrayExm();
		assertEquals(0, ob.isprime(-7));
	}

	@Test
	void testZero() {
		arrayExm ob = new arrayExm();
		assertEquals(0, ob.isprime(0));
	}

}
