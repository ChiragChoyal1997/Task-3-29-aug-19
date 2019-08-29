package com.stringexample;
/**
 *
 * @author Chirag
 */
public class SplitCountry {
    public static void main(String args[]){
        String s="India,Australia,England,Canada";
        int len = s.length();
        String s1;
        int start = 0;        
        while(len>start){
            try{
                s1 = s.substring(start,s.indexOf(",", start));
                start= s.indexOf(",",start)+1;
            }
            catch(Exception e){
                s1 = s.substring(start, s.length());
                start = len;
            }
            System.out.println(s1);
        }
    }
}
