 package com.lecture.Arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		  int arr[];
//		  arr = new int[5];
//		  
//		  arr[0]=10;
//		  arr[1]=5;
//		  arr[2]=62;
//		  arr[3]=45;
//		  arr[4]=6;
//		  
//		  //Lenth of array
//		  //System.out.println(arr.length);
//		  
//		  for(int i=0; i<arr.length;i++) {
//			  System.out.print(arr[i]+" ");
//		  }

	int arr[]= {12,9,-2,21,65,32,-34};
	
//	System.out.println(arr.length);
//	 for(int i=0; i<arr.length;i++) {
//		  System.out.print(arr[i]+" ");
//	  }
	 
	 System.out.println("");
	 
	 //For Each Loop 
	 for(int a : arr) {
		 System.out.print(a +" ");
	 }
	 System.out.println("");
	 //toString()
     System.out.println(Arrays.toString(arr));
	 
     //sort()
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
     
     //fill() 
     Arrays.fill(arr,-14 );
     System.out.println(Arrays.toString(arr));
     
     int a=5,b=5;
     int arr2[]= {1,2,3};
     int arr3[]= {1,2,3};
     System.out.println("hashcode of arr2 : "+arr2.hashCode());
     System.out.println("hashcode of arr3 : "+arr3.hashCode());

     System.out.println(a==b);
     //to Compare two arrays memory location
     System.out.println(arr2==arr3);
     //to Compare two arrays elements
     System.out.println(Arrays.equals(arr2, arr3));
     //to copy of arr2
     int arr6[]=Arrays.copyOf(arr3, arr3.length);
     System.out.println("Arr6"+ Arrays.toString(arr6));
     int a1=5;
     int b1=a1;
     
      a1=10;
     System.out.println(b1);
     
     int arr4[]= {1,2,3};
     int arr5[]=  arr4;
     
      arr4[0]=2;
     System.out.println(Arrays.toString(arr5));
     arr5[1]=51;
     System.out.println(Arrays.toString(arr4));
	}

}
