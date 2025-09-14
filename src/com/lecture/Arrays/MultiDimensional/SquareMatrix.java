package com.lecture.Arrays.MultiDimensional;

public class SquareMatrix {

	public static void main(String[] args) {
		int arr[][] = { {12,218,328,592},
						{54,525,342,572},
						{127,258,327,52},
						{127,217,312,542}
					  };

		System.out.println(arr[0].length);
		// Square matrix main diagonal elements
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i][i]+" ");
//			System.out.println();
//		}
//		System.out.println("*****************************");
		
		// Square matrix reverse main diagonal elements
//		for(int i=arr.length-1; i>=0;i--) {
//			System.out.print(arr[i][i]+" ");
//			System.out.println();
//		}
		
      System.out.println("*****************************");
		
		//reverse Square matrix elements row-wise
//      for(int i=0;i<arr.length;++i) {
//		for(int j=arr[0].length-1; j>=0;--j) 
//			System.out.print(arr[i][j]+" ");
//			System.out.println();
//		}
		
		for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i][i]+" ");
		
	}
		System.out.println();
   // Square matrix  Secondary diagonal elements
      for(int i=0,j=arr.length-1; i<arr.length;++i,--j) {
			System.out.print(arr[i][j]+" ");
			
		}
	}

}
