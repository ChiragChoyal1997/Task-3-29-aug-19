package com.stringexample;

/**
 *
 * @author Chirag
 */
public class Palindrome {
    public static void main(String args[]){
        String s = "askjfslsfjksa";
        String isPalindrome = "String is palindrome"; 
      
        for(int i=0; i<=(s.length()-1)/2;i++){
                if(s.charAt(i) != s.charAt(s.length()-(i+1))){
                    isPalindrome = "String is not palindrome";
                    break;
                }
            }
        
        System.out.println(isPalindrome);
    }
}
