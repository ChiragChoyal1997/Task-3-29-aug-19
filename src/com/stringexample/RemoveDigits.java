package com.stringexample;
/**
 *
 * @author Chirag
 */
public class RemoveDigits {
    public static void main(String args[]){
        String s="ad3daddfd5443dfsfss";
        String s1 = s.replaceAll("[0-9]", "");   
        System.out.println(s1);
    }
}
