package com.PracticeQuestions;

import java.util.Arrays;

public class RemoveDuplicateElemArray {

	public static void main(String[] args) {
		   
		        int nums[] = {0,0,1,1,1,2,2,3,3,4};
		        System.out.print(Arrays.toString(nums) );
		        int finArr[]=new int[nums.length];
		        int elem=0; int count=0;
		        int countAll=0;
		        for(int i=0;i<nums.length;i++){
		            elem=nums[i];
		           // System.out.print(elem );
		           // countAll++;
		            for(int j=1;j<i;j++){
			            if(elem == nums[j] && elem==nums[i-j]){
			                finArr[j]=elem;
			                count++;
			                }
		        }
		        
		        }
		        System.out.println();
		        System.out.println(count +" -- "+ Arrays.toString(finArr));
		     //return count+","+finArr;
		    }

}
