package com.Lect_3.Conditional_Statement;

import java.util.*;

public class Conditional_Statement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.println("Enter 2nd number: ");
    int b = sc.nextInt();
    System.out.println("Enter 3rd number: ");
    int c = sc.nextInt();

    if (a > b) {
      System.out.println(a);
    } else if (b > c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }

    int d = ((a > b) ? a : b) > c ? ((a > b) ? a : b) : c;
    System.out.println("D :" +d);
  }

}
