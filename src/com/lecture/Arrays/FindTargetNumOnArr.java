package com.lecture.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindTargetNumOnArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		
		int N = sc.nextInt();
		int arr[] =new int[N];
		//Take input for N elements of array
		System.out.println("Enter "+ N +" Array Elemets :");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter a Tarrget Number");
		int targetNum=sc.nextInt();
		
		//now, the actual problem start...
		boolean res=false;
		
		for(int num : arr) {
			if(num == targetNum) {
				res=true;
				break;
			}
		}
		System.out.println(res);
	}

}
