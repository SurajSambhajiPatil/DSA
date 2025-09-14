package com.lecture.Arrays.MultiDimensional;

import java.util.Scanner;

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
         // 0,1,2,....N
         for(int en=st; en<N; en++){
             //print subarray start at st and end at en
             for(int i=st; i<=en; i++){
                 System.out.print(arr[i]+" ");
                
              } System.out.println("");
         }
         
     }
    }

}
