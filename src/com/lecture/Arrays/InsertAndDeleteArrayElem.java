 package com.lecture.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAndDeleteArrayElem {
	
	//Display only n element or actual element/size
	public static void display(int[] arr, int n) {
	for(int i=0; i<n; i++) {
		System.out.print(arr[i]+" ");
	}	
	}
	//Insert Fun
	public static int insertAtEnd(int[] arr,int n,int val) {
		if(n < 100) {
			arr[n]=val;
			return n+1;
		}
		else return n;
	}
	//Insert at index
	public static int insertAtIndex(int[] arr,int n,int val,int id) {
		if(id < 100) {
			arr[n]=val;
			return n+1;
		}
		else return n;
	}
	//Delete Fun
	public static int deleteAtEnd(int[] arr,int N) {
		if(N >= 1) {
			arr[N-1] = 0;
			return N-1;
		}
		else return N;
	}
	//Delete from beggining
	public static int deleteFromBegining(int[] arr,int N) {
		if(N == 0)
			return N;
		
		for(int i=0 ; i+1<N; ++i) {
			arr[i]=arr[i+1];
		}
		arr[N-1]=0;
		return N-1;
	}
	//Delete at index
	public static int deleteAtIndex(int[] arr,int N,int id) {
		if(N == 0)
			return N;
		
		if(id < 0 || id >= N)
			return N;
		
		for(int i=id ; i+1<N; ++i) {
			arr[i]=arr[i+1];
		}
		arr[N-1]=0;
		return N-1;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[] =new int[100];
		System.out.println("Enter size of array you want..");
		//Taking inputs for array
		int N=sc.nextInt();
		System.out.println("Enter elements of array you want..");
		for(int i=0; i<N; i++)
			arr[i]=sc.nextInt();
		
		//Delete from the End
		/*if(N >= 1) {
			arr[N-1] = 0;
			N--;
		}
		display(arr,N);*/
		
		//Insert 15 at the end
		/*if(N < 100){
		arr[N] = 15;
		N++;
		}
		display(arr,N);
		*/
		//System.out.println("Enter value that are you want to insert at end..");
		//int val=sc.nextInt();
		//int insertAtEnd = insertAtEnd(arr, N, 20);
		//System.out.println(insertAtEnd);
		//display(arr,insertAtEnd);
		
//		int deleteAtEnd = deleteAtEnd(arr,N);
//		System.out.println(deleteAtEnd);
//		display(arr,N);
		
//		deleteFromBegining(arr, N) ;
//		display(arr,N);
		
		deleteAtIndex(arr , N , 3);
		//System.out.println(Arrays.toString(arr));
		display(arr,N);
		insertAtIndex(arr, N, 20,2);
		display(arr,N);
	}



	

}
