package com.lect_5.problems;

import java.util.Scanner;

public class SumOfDigitsBtRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num :");
		int r = sc.nextInt();
		System.out.println("Enter balue of K num :");
		int k = sc.nextInt();
		

	
		// Iterating over all the values over l
		for (int n = 1; n <= r; ++n) {
            int sum = 0;
			//Calculating the sum of the digits for n
			for (int num = n; num > 0; num /= 10) {
			    
               int  rem = num%10;
                 sum+=rem; 
			}
			if(sum == k)
           System.out.println(n +"     "+sum);
		}
		sc.close();
	}

}
