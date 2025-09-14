package com.lecture.Arrays;

import java.util.Scanner;

public class MultiplyOfTwoMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A,B,C length");
		int  A = sc.nextInt();
		int  B = sc.nextInt();
		int  C = sc.nextInt();
		
		int m1[][] = new int[A][B];
		int m2[][] = new int[A][B];
		int ans[][] = new int[A][B];
		
		for(int i=0;i<A;++i) {
			for(int j=0;i<B;++j) {
				System.out.println("Enter m1 element");
				m1[i][j] = sc.nextInt();
			}
	    }
		for(int i=0;i<B;++i) {
			for(int j=0;i<C;++j) {
				System.out.println("Enter m2 element");
				m2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<A;++i)
			for(int j=0;i<B;++j)
				System.out.print(m1[i][j]); 
		System.out.println();
		
		for(int i=0;i<B;++i)
			for(int j=0;i<C;++j)
				System.out.print(m2[i][j]); 
		System.out.println();
		

	}

}
