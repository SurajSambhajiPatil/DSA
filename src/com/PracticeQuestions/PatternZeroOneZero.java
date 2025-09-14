package com.PracticeQuestions;
import java.util.*;
	
public class PatternZeroOneZero {

	
	    public static void main(String[] args) {
	        // System.out.println("Try programiz.pro");
	    
	        Scanner  sc = new Scanner(System.in);
	          System.out.println("Enter a number");
	        int k=sc.nextInt();
	        int num=1;
	        for(int i=1; i<=k;++i){
	            
	            for(int j=1;j<i;++j){
	                 System.out.print(num);
	                 
	            }
	            num=1-num;
	        }
	    }   
	   
	}


