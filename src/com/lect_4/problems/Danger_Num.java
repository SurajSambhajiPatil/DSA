package com.lect_4.problems;

import java.util.Scanner;

public class Danger_Num {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int dangerNum = 9;
		System.out .println("Enter n value");
		int n=sc.nextInt();
		for (int i=0;i<=n;i++) {
			System.out.println(i);

			if(i == 9) {	
				break;
			}
			
		}
	}

}
