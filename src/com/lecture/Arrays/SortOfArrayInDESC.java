package com.lecture.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SortOfArrayInDESC {

	public static void main(String[] args) {
		int arr[]= {20,30,2,3,1,11,2,1,9,10};

		//To find the disinct of element in between arr
		Arrays.stream(arr).distinct().forEach(i->System.out.print(i+","));
		
		System.out.println();
		//to sort array in desc and asc format
		Arrays.stream(arr).sorted().forEach(i->System.out.print(i+","));
		
//		int arr[]= {10,20,30,2,3,1,11,2,1,9,10};
//		find the target element form an array 
//		let consider target element is 10 also return the index of that element
//		using java 8 features		
		System.out.println();
		int target_num=10;
	      // Use IntStream to find the index of the target element
        OptionalInt indexOpt = IntStream.range(0, arr.length)
                                        .filter(i -> arr[i] == target_num)
                                        .findFirst();

        // Check if the index is present and print it
        if (indexOpt.isPresent()) {
            System.out.println("Target element " + target_num + " found at index: " + indexOpt.getAsInt());
        } else {
            System.out.println("Target element " + target_num + " not found.");
        }
	}

}
