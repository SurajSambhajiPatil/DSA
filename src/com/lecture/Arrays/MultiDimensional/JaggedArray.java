package com.lecture.Arrays.MultiDimensional;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][] = new int[6][3];
		System.out.println("Rows >> "+arr.length);
		System.out.println("Columns >> "+arr[0].length);
//
//		int arr2[][] = {
//				        {1,2,3},
//				        {4,5,6}
//					   };
//		
//		//Row-wise Traverse 1
//		for(int i=0; i<arr2.length; i++) {
//			for(int val : arr2[i] )
//				System.out.print(val+" ");
//			System.out.println();
//		}
//		System.out.println("*********************************");
//		//Row-wise Traverse 2
//		for(int i=0; i<arr2.length; i++) {
//
//			for(int j = 0; j<arr2[i].length; j++)
//				System.out.print(arr2[i][j] +" ");	
//			System.out.println();
//		}
		
		//Jagged Array
//		int brr[][] = new int[3][];
//		System.out.println(brr[1]);
		
		int crr[][] = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
					  };
		System.out.println("Rows >> "+crr.length);
		System.out.println("Columns >> "+crr[0].length);
//		for(int j=0; j<crr[0].length; j++) {
//			for(int i=0; i<crr.length; i++)
//				System.out.print(crr[i][j] +" ");
//			System.out.println();
//		}
	}

}
