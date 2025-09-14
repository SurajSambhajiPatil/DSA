package com.lect_4.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enyter the value of n: ");
		int n=sc.nextInt();
		int sum=0;
		//String arr[] = new String[3];
		ArrayList<String> arr =new ArrayList<>(3);
		for(int i=1; i<=n;i++) {
			 if (i%4==0 && i%3!=0) {
				 String str = Integer.toString(i);
					arr.add(str);
					continue;	
				}
			 else if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			 //arr[0]="FizzBuzz";
				arr.add("FizzBuzz");
			 }
			else if(i%3==0) {
				System.out.println("Fizz");
			 //arr[1]="FizzBuzz";
				arr.add("Fizz");	
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			//arr[2]="FizzBuzz";
				arr.add("Buzz");
				}
          
			else {
				System.out.print(i);
				String str = Integer.toString(i);
				arr.add(str);
//			    sum+=i;
//			    if(sum > 3*n){
//					break;
//				}
			}
			 
			
		}
	// System.out.println(sum);
	 System.out.print(arr);
	}

}
