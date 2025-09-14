package com.PracticeQuestions;

// Que - Print first N numbers that have sum of digits equal to K;

public class SumOfDigEqualTargetNum {

	public static void main(String[] args) {
		int N = 5, k = 15;
		int sum = 0, rem = 0;
		// traversing upto max num
		for (int i = 0; i <= N; i++) {
			// calculating sum of digits
			int num = i;
			System.out.println("Num :" + num);
			while (num > 0) {
				rem = num % 10;
				num /= 10;
				sum += rem;
			}
			System.out.println("Sum :" + sum);
			// Print only N number
			for (int j = 0; j < 5; ++j) {
				if (sum == k) {
					System.out.println("Number :" + num + "----" + "Sum :" + sum);
				}
			}
		}

	}

}
