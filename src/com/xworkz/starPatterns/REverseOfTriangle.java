package com.xworkz.starPatterns;

public class REverseOfTriangle {

	public static void main(String[] args) {

		int num = 4;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if ((j >= i && i + j <= num) || (i + j >= num && j<= i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		/*
		 * for (int i = 0; i <= num; i++) { for (int j = 0; j <= num; j++) { if (j >= i
		 * && i + j <= num) System.out.print("*"); else System.out.print(" "); }
		 * System.out.println(); }
		 * 
		 * System.out.println(); System.out.println(); System.out.println(); for (int i
		 * = 0; i <= num; i++) { for (int j = 0; j <= num; j++) { if (i + j >= num && j
		 * <= i) System.out.print("*"); else System.out.print(" "); }
		 * System.out.println(); }
		 */

	}

}
