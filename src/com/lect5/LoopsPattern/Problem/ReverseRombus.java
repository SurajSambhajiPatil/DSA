package com.lect5.LoopsPattern.Problem;

import java.util.Scanner;

public class ReverseRombus {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    
    int n =sc.nextInt();
    
    //Printing rows
    for(int i=1 ; i<=n ; i++) {
    	
    	//Num of Spaces
    	for(int sp=1   ;sp<=(n-i);sp++)
    		System.out.print(" ");
    	//Printing stars
    	for(int st=1;st<=n;st++) 
    		
    	System.out.print("*");
    	System.out.println("");
    	
    }

	}

}
