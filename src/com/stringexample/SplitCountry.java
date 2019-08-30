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
                int y = s.indexOf(",", start);
                if(y>0){
                s1 = s.substring(start,y);
                start= s.indexOf(",",start)+1;
                }
                else{
                s1 = s.substring(start, s.length());
                start = len;
                }
            System.out.println(s1);
        }
    }
}
