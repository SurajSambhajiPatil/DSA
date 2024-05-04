package com.lect5.LoopsPattern.Problem;

import java.util.Scanner;

public class ReverseDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row number :");
		int n =sc.nextInt();
		
		int num_stars=1;
		
		//Printing a n row
		for(int row =1 ; row<=n ; row++) {
			
			//Print (n-row) space character
			for(int sp=1;sp<=(n-row);sp++) 
				System.out.print(" ");
			
			//print num_stars of stars
			for(int st=1; st<=num_stars;st++) 
				System.out.print("*");
				
				//entering in to next line
				System.out.println("");
				
				//increament num_star by 2
				num_stars += 2;
			   
		}
		 num_stars = 2*(n-1)-1;
		    
		    for(int r =n-1; r >=1; --r) {
		    	
		    	//Print (n-row) space character
				for(int sp=1;sp<=(n-r);sp++) 
					System.out.print(" ");
		    	
		    	//print num_stars of stars
				for(int st=1; st<=num_stars;st++) 
					System.out.print("*");
				System.out.println("");
				
				//decreament num_star by 2
				num_stars -= 2;
		    }

	}

}
