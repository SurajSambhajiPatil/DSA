package com.PracticeQuestions;

public class StaticBlock {
//	static {
//		System.out.println("This is Static Block.....");
//	}
//	
//	static {
//		System.out.println("This is Static Block 2.....");
//	}

	public static void main(String[] args) {
		int candidates[] = {10,1,2,7,6,1,5};
		int sum=0;
		int targetSum=8;
//1)		// Calculate the sum of digits in array
//		for(int i=0;i<candidates.length;i++) {
//			sum=candidates[i]+sum;
//			
//		}
//		System.out.println(sum);

		
//2)	SubArrays of that Array
		//For Starting of sub array
		for(int st=0; st<candidates.length;st++) {
			//For Ending of sub array
			for(int en=st;en<candidates.length;en++) {
				//For Printing of sub array
				int i;
				for( i=st;i<=en;i++) {
				System.out.print(candidates[i]+" ");
				
				}
				
				System.out.println();
			}
		}
	}

}
