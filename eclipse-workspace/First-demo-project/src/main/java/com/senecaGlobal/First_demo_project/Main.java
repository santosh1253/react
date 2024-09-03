package com.senecaGlobal.First_demo_project;

public class Main {
	public static void main(String[] args) {
		System.out.println("From Main Method");
	}

	int arraySum(int a[]) {
		int sum = 0;
		for (Integer x : a) {
			sum += x;
		}
		return sum;
	}

	public int[] sort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
