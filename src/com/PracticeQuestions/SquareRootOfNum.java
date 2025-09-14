package com.PracticeQuestions;

public class SquareRootOfNum {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int x=8;
        System.out.println("1st "+ Math.sqrt(x));
        int num =(int)Math.sqrt(x);
        System.out.println("1st "+ num);
        // if(x < 0){
        //     return 0;
        // }

    if(x >0 || x <= Integer.MAX_VALUE/10 || x == Integer.MAX_VALUE/10){
    
        int num1 = (int) (x / 2);
        
        int res = (int) Math.round(num1);
        System.out.println(res);

    }
        
    }

}
