package com.Lect_3.Conditional_Statement;
import java.util.Scanner;

public class Days {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Week Days");
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
	}

}
