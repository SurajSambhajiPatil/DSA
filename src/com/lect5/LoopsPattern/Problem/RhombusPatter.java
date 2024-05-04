package com.lect5.LoopsPattern.Problem;

import java.util.Scanner;

public class RhombusPatter {
	/*
		* * * * * 
		 * * * * * 
		  * * * * * 
		   * * * * * 
		    * * * * *
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for (int rows = 1; rows <= n; ++rows) {
			for(int sp=1;sp<=(rows-1);sp++)
			System.out.print(" ");
			for (int st = 1; st <= n; st++)
				System.out.print("* ");  
			System.out.println("");

		}
	}

}
