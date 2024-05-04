package com.lect_5.problems;

import java.util.Scanner;

public class SumOfNumTillSingleDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num = sc.nextInt();

		addDigits(num);
	}

	public static int addDigits(int num) {
		int sum = 0;
		int fin_sum = 0;
		for (int n = num; n > 0; n /= 10) {
			int rem = n % 10;
			sum += rem; 

		}
		System.out.println("First Sum :" + sum);
		for (int s = sum; s > 0; s /= 10) {
			int rem1 = s % 10;
			fin_sum += rem1;

			if(rem1 < 10) {
				fin_sum=1;
			}else {
			fin_sum += rem1;
			}
		}
		System.out.println("Final Sum :" + fin_sum);
		return fin_sum;
	}
}
