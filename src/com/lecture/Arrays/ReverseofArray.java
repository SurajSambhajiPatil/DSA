package com.lecture.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Problem : Print Reverse of Arrays Element ?
public class ReverseofArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		System.out.println("Enter N Elements of arrays :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = arr.length-1 ; i >=0 ; i--) {
			System.out.print(arr[i] +" ");
		}
		
		
//		System.out.println();
//		  Collections.reverse(Arrays.asList(arr)); 
//	        System.out.println(Arrays.asList(arr));
	}

}
