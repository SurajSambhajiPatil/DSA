package com.lect_4.problems;

import java.util.Iterator;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enyter the value of n: ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			 if (i%4==0) {
					continue;	
					}
			 else if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
          
			else {
				System.out.println(i);
//			    sum+=i;
//			    if(sum > 3*n){
//					break;
//				}
			}
			
			
		}
	 System.out.println(sum);
	}

}
