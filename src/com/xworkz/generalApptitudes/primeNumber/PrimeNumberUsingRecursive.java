package com.xworkz.generalApptitudes.primeNumber;

import java.util.Scanner;

public class PrimeNumberUsingRecursive {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		System.out.println(number);

		PrimeNumberUsingRecursive recursive = new PrimeNumberUsingRecursive();
		recursive.primeNumber(number);
	}

	boolean primeNumber(int number) {

		return false;
	}

}
