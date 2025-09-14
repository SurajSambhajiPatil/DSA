package com.PracticeQuestions;

public class CountOfVowelsInString {

	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
   String str="ashookit";
   
   char arr[] ={'a','e','i','o','u'};
   char c,d;
   int count=0;
   
   for(int i =0; i<str.length();i++){
       //System.out.println(str.charAt(i));
       c =str.charAt(i);
      //   System.out.print(c);
      for(int j=0; j<arr.length;j++){
          d=arr[j];
          //System.out.println();
          //   System.out.print(d);
          if(c==d){
             
              count++;
          }
      }
   } System.out.println(count);
    }

}
