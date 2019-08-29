package com.stringexample;
/**
 *
 * @author Chirag
 */
public class Count {
    public static void main(String args[]){
        String s = "hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
        
            int symbol = 0;
            int capalpha = 0;
            int smallalpha = 0;
            int numbers = 0;
            int space = 0;
            
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((int)c >= 65 && (int)c <= 90){
                capalpha++;
            }
            else if((int)c >= 97 && (int)c <= 122){
                smallalpha++;
            }
            else if((int)c >=48 && (int)c<=57){
                numbers++;
            }
            else if((int)c == 32){
                space++;
            }
            else{
                symbol++;
            }
        }
            System.out.println("Capital alphabet :- "+capalpha);
            System.out.println("Small alphabet :- "+smallalpha);
            System.out.println("Numbers :- "+numbers);
            System.out.println("Spaces :- "+space);
            System.out.println("Symbol :- "+symbol);
    }
}
