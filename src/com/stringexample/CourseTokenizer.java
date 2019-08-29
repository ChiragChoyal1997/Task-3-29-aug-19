package com.stringexample;
import java.util.*;
/**
 *
 * @author Chirag
 */
public class CourseTokenizer {
    public static void main(String[] args) {
        String s="1.java,2.oracle,3.python,4.php,5.linux";
        StringTokenizer st = new StringTokenizer(s.replaceAll("[0-9]", ""), ",.");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
