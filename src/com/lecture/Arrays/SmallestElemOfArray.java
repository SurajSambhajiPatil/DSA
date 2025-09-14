package com.lecture.Arrays;

import java.util.Scanner;

public class SmallestElemOfArray {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a num :");
//		int N = sc.nextInt();
//		int arr[] = new int[N];
//		
//		System.out.println("Enter N Elements of arrays :");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}

		int arr[] = {12,24,21,32};
		int min_element = arr[0];
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i] < min_element) {
				 min_element = arr[i];
			 } 
		 }
		 
		 System.out.println("1st Smallest Num Is : "+min_element);
		 
		 int sec_min_element=Integer.MAX_VALUE;
		 
		 for(int i=0; i<arr.length; i++) { 
			 if(arr[i] == min_element) 
				 continue;
			 if(arr[i] < sec_min_element)
			 sec_min_element = arr[i];
		 }
		 
		 if(sec_min_element == Integer.MAX_VALUE) {
		  min_element=-1;
		  sec_min_element=-1;
		 }
		 
		 System.out.println("2nd Smallest Num Is : "+sec_min_element);
		 
		 
	}

}
