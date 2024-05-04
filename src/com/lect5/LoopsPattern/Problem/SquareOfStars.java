package com.lect5.LoopsPattern.Problem;

import java.util.Scanner;

public class SquareOfStars {
	/*      if n=5; then 5 rows , 5 columns
	         *****
	         *****
	         *****
	         *****
	         *****
	 */

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		//print rows
		for(int rows=1;rows<=n;rows++) {
		
			//print num of stars
			for(int st = 1; st<=n;st++) 
				System.out.print("* ");
				System.out.println("");
		}
		sc.close(); 
	}

}
