package com.lecture.Arrays.MultiDimensional;

import java.util.Scanner;

public class MultiplicationtTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = {
		        {1,2,3},
		        {4,5,6}
			   };
				
		int arr2[][] = { {2,1,3},
				         {4,2,3},
				         {1,5,2}         
			  };
		int m=arr[0].length;
		int n=arr2.length;
		int ans[][] = new int[m][n];
		System.out.println(arr.length+" , "+arr[0].length);
		System.out.println(arr2.length+" , "+arr2[0].length);
		for(int i=0;i<m;i++) 
			for(int j=0;i<n;j++) {
				int cur=0;
				for(int k=0;k<arr2.length;k++)
				cur += arr[i][k] * arr[k][j];
				
				ans[i][j]=cur;
		}
		System.out.println(ans.length);
		for(int i=0; i<ans.length; i++) {			
			for(int j = 0; j<ans[i].length; j++)
				for(int k = 0; k<ans.length; k++)
				System.out.print(ans[i][j] +" ");	
				System.out.println();
		}
	}

}
