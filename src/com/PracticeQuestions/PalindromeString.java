package com.PracticeQuestions;

public class PalindromeString { 

	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //String str="A man, a plan, a canal: Panama";
        String str="MADDAM";
     String op = str.replace(" ","");
    System.out.println(op);
    String rev1=""; String rev="";
    
    String orgSTr=op;
     orgSTr = orgSTr.replaceAll("[^a-zA-Z0-9]", "");
     int a=orgSTr.length();
     System.out.println(a);
     int rem=a%2;
     int b=a/2;
     if(rem!=0) {b+=1;}
     System.out.println(b);
     String subString=orgSTr.substring(0,b+1);
     System.out.println(subString);

    for(int i=b; i<a;++i){
          rev = orgSTr.charAt(i)+rev;           
    }System.out.println(rev);
     if(subString.equalsIgnoreCase(rev)){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
      
    }
}
