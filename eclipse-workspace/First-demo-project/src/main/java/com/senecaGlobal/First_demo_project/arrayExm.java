package com.senecaGlobal.First_demo_project;

public class arrayExm {

	public static void main(String a[]) {
		System.out.println("From main Method");
	}

	public int isprime(int n) {
		if (n <= 1)
			return 0;
		if (n % 2 == 0)
			return 0;
		if (n == 2)
			return 0;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return 0;
		}
		return 1;
	}

}
