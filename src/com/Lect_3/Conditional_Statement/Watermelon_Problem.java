package com.Lect_3.Conditional_Statement;

import java.util.Scanner;

public final class Watermelon_Problem {
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();//Take the input
	
		if(w>2 && w%2 ==0 ) 
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
