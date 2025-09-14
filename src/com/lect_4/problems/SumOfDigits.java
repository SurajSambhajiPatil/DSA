package com.lect_4.problems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		int rem, sum = 0;

		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum += rem;
			//System.out.println("rem :" + rem);
		}
		System.out.println("Sum of Digits :" + sum);
		
		sc.close(); 
	}

}
