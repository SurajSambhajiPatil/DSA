package com.lecture.Arrays.MultiDimensional;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
//		 System.out.println("Enter A and B values");
//		 int R = sc.nextInt();
//		 int C = sc.nextInt();
//		 
//		 int arr[][] = new int[R][C];
//		 for(int i=0; i<R; ++i) {
//			 for(int j=0; j<C; ++j) {
//				 System.out.println("Enter the array element");
//				 arr[i][j] = sc.nextInt();
//			 }
//		 }
		
		 int arr[][] = {{1, 2, 3, 4, 5, 6},
				 		{26,27,28,29,30,7},
				 		{25,24,23,22,21,8},
				 		{16,17,18,19,20,9},
				 		{15,14,13,12,11,10}};
		 int R = arr.length;
		 int C = arr[0].length;
		 
		
		 int top = 0, bot = R-1, left = 0, right = C-1;
		 while(top <= bot && left <= right) {
		 //Step 1: Print TOP Row upto C-1 (Left to right)
		 for(int col = top; col<right; col++)
			 System.out.print(arr[top][col] +" ");
		 
		 //Step 2 print right most column from to bot
		 for(int row=top; row<right-1; row++)
			 System.out.print(arr[row][right] +" ");
		 
		 //Step 3 print last row from right to left
		 for(int col=right; col > left ; col--)
			 System.out.print(arr[bot][col] +" ");
		 
		//Step 4 print left column  from bot to to
		 for(int row=bot; row > top ; row--)
			 System.out.print(arr[row][left] +" ");
		 
		 top++;    left++;
		 bot--;    right--;
		 
		 }
		 //Print arr
//		 for(int i=0; i<R; ++i)
//			 for(int j=0; j<C; ++j)
//				 System.out.print(arr[i][j] +" ");
//		 System.out.println();
	}

}
