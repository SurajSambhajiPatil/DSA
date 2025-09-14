package com.lect_5.problems;

import java.util.Scanner;

public class SumOfNumTillSingleDigit {

	public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            //System.out.println(num);
        }
        return num;
    }
	
	
    public static void main(String[] args) {
        
        // Example usage
        System.out.println(addDigits(199));  // Output: 2
       // System.out.println(solution.addDigits(0));   // Output: 0
    }
}
