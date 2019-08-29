package com.stringexample;
/**
 *
 * @author Chirag
 */
public class PalindromeStringBuffer {
    public static void main(String args[]){
        String s = "madam";
        StringBuffer sb = new StringBuffer(2*s.length());
        sb.append(s);
        sb.append(s);
        String isPalindrom = "String is palindrom";
        for(int i=0,j=sb.length()-1;i<s.length() && j>s.length();i++,j--){
             if(sb.charAt(j) != sb.charAt(i)){
                 isPalindrom = "String is not palindrom";
                 break;
             }
        }
        System.out.println(isPalindrom);
    }
}
