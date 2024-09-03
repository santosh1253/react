package com.senecaGlobal.First_demo_project;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		System.out.println("from main method");

	}
//	public static void isPrime(int x)
//	{
//		System.out.println(isprime(x));
//	}
	public static int isPrime(int n) {
		if (n <= 1)
			return 0;
		if (n % 2 == 0)
			return 0;
		if (n == 2)
			return 0;
		for (int i = 3; i * i <= n; i += 2)
		{
			if (n % i == 0)
				return 0;
		}
		return 1;
}
}
