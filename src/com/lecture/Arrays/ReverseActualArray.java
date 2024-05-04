 package com.lecture.Arrays;

import java.util.Scanner;

//Problem :  Reverse Actual Arrays and Print it ?
public class ReverseActualArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Take input of size of array
		System.out.println("Enter a num of array :");
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		//Inputs for N elements of array
		System.out.println("Enter "+N+" number of array element");
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
	/* 1st Approach
	 * 	//write the code to reverse the array
		int i=0;   //start i from the beginning
		int j=N-1; //start j from the end
		
		while(i < j) {
			
			//swap arr[i] and arr[j]
			int temp = arr[i];
			arr[i]   = arr[j];
			arr[j]   = temp;
			
			//update value of i and j
			i++;
			j--;
			
		}*/
		
		// 2nd Approach
		for(int i =0; i<N/2; ++i) {
			//swap arr[i] and arr[j]
			int temp = arr[i];
			arr[i]   = arr[N - 1 - i];
			arr[N - 1 - i]   = temp;
		}
		for(int val :arr){
			System.out.print(val +" ");
		}
		
		sc.close();

	}

}
