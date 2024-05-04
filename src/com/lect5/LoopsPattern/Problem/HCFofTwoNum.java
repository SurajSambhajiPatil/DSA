package com.lect5.LoopsPattern.Problem;

import java.util.Scanner;

public class HCFofTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		int smallNum =(a>b)?a:b;
		for(int i=smallNum; i >0 ; i--) {
		
			while(a%i == 0 && b%i ==0) {
			
				System.out.println(i);
				break; 
			}
			
		
		     
		}  
		}
	}


