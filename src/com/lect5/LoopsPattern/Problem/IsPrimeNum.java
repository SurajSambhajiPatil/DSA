package com.lect5.LoopsPattern.Problem;

import java.util.Scanner;

public class IsPrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num=sc.nextInt();
		
		while (num %2 ==0) 
			num/=2;
			
			if(num == 1)
				System.out.println(true);
			else
				System.out.println(false);
			
		
		
	}

}
