package com.PracticeQuestions;

import java.util.Scanner;

public class FactorsOfNum {

	 public static boolean isUgly(int n) {
	        if(n<=0){
	            return false;
	        }
	        if(n==1){
	            return true;
	        }

			/*
			 * if(n%2==0){ n = n/2; //if(n/2==1){return true;} //else{return false;} }
			 * if(n%3==0){ n = n/3; // if(n/3==1){return true;} //else{return false;} }
			 * if(n%5==0){ n = n/5; //if(n/5==1){return true;} //else{return false;} }
			 */
	        if (n % 2 == 0) {
				return (isUgly(n=n / 2));
			}
			if (n % 3 == 0) {
				return (isUgly(n=n / 3));
			}
			if (n % 5 == 0) {
				return (isUgly(n=n / 5));
			}
			
	           if(n==1){return true;}
	           else{return false;}
	    }
    
	public static void main(String[] args) {
	System.out.println(FactorsOfNum.isUgly(14));

	}

}
