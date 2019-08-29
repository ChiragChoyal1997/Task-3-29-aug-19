package com.stringexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Chirag
 */
public class DomainCount {
    public static void main(String args[])
    {
        String mail[] = {"bagga@gmail.com","manav@gmail.com","sunny@gmail.com","anuj@yahoo.com","sadiya@rediff.com","amaya@yahoo.com","juhi@rediff.com"};
        HashMap<String,Integer> hm = new HashMap();
        for(String a:mail){
            String checker = a.substring(a.lastIndexOf("@"),a.length());
            hm.compute(checker,(key,value) -> value == null ? 1:value+1);
        }
        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" :- "+entry.getValue());
        } 
    }
}
