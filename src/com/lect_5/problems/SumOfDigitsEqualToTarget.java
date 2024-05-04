package com.lect_5.problems;

import java.util.Scanner;

public class SumOfDigitsEqualToTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target Count:");
		int targetCount=sc.nextInt();
		System.out.println("Enter the Target Sum of digits num:");
		int  targetSum =sc.nextInt();
		
		//Start from 1 keep checking the sum of digits of all natural numbers,one by one
		//whenever we find the digitSum == targetSum 
		//print it
		//count += 1;	
		int curNum =1, count=0 ;
		
		while(count < targetCount) {
		//Calculate the digit sum for curSum
		int curSum=0;
		for(int num = curNum; num>0; num/=10 ) 
			curSum += ( num%10);
		
			if(curSum == targetSum) {
				System.out.println(curNum);
				count++;
			}
			curNum++;		
		}
	}

}
