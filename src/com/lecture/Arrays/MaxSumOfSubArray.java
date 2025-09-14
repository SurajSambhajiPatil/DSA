package com.lecture.Arrays;

public class MaxSumOfSubArray {

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	    public static void main(String[] args) {
	       
	        int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
	        int n=arr.length;
	        System.out.println("Length>>>> "+n);
	        int sum=0;
	        int num=0;
	        //Start from 0, 1, 2, ..., n-1
	        for(int st = 0; st < n; ++st){
	            //end at st, st+1, st+2, ..., n
	            for(int en = st; en < n; ++en){
	                //Print the subarray by using st & en
	                for(int i = st; i <= en; ++i){
	                    System.out.print(arr[i]+" ");
	                    //      sum+=arr[i];
	                    // System.out.println("Sum>>"+sum);
	                     num = arr[i];
	                }
	                sum+=num;
	                System.out.println();
	                 //System.out.println("Sum>>"+sum);
	            }
	            //System.out.println("Sum>>"+sum);
	        } //System.out.println("Sum>>"+sum);
	    }
	
}
