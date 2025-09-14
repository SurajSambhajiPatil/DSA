package com.lecture.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SubArrayOfArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide num of elements of arrays:");
        int N =sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Please provide elements of arrays:");
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
       
     //Start from 0,1,..,N-1 
     for(int st=0; st<N; ++st){
         //End at st, st+1, st+2,....,N
         // 0,1,2,....,N
         for(int en=st; en<N; en++){
             //print sub-array start at st and end at en
             for(int i=st; i<=en; i++){
                 System.out.print(arr[i]+" ");
                 
              } System.out.println("");
         } 
     }
    	
//    	List<String> l1=new ArrayList<>(Arrays.asList("Hello"," ","Suraj"));
//    	String collect = l1.stream().collect(Collectors.joining());
//    	System.out.println(collect);
//    	
    	
    	
    }

}
