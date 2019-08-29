package com.stringexample;

import java.util.StringTokenizer;

/**
 *
 * @author Chirag
 */
public class JavaWordCount {
    public static void main(String args[]){
        String s="this is java and java is object oriented and java is powerful. I love java language";
        StringTokenizer st = new StringTokenizer(s);
        int count = 0;
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals("java")){
                count++;
                System.out.println(token);
            }
        }
        System.out.println("java count is :- "+count);
    }
    
}
