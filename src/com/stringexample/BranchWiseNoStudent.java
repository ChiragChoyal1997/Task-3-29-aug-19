package com.stringexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Chirag
 */
public class BranchWiseNoStudent {
    public static HashMap<String,Integer> branchWiseMapping(String roll[]){
        HashMap<String,Integer> hm = new HashMap();
        for(String r:roll){
            String checker = r.substring(0,2);
            switch (checker) {
                case "12":
                    hm.compute("CS", (key,value)-> value == null ? 1:value+1);
                    break;
                case "34":
                    hm.compute("IT", (key,value)-> value == null ? 1:value+1);
                    break;
                case "56":
                    hm.compute("MECH", (key,value)-> value == null ? 1:value+1);
                    break;
                case "78":
                    hm.compute("CIVIL", (key,value)-> value == null ? 1:value+1);
                    break;
                default:
                    break;
            }
        }
        return hm;
    }
    
    public static void main(String args[]){
        String rollno[] = {"123434","341543","563323","121345","345674","128796","563421","789896","782391","5634412"};
  
        Set<Map.Entry<String, Integer>> entrySet = BranchWiseNoStudent.branchWiseMapping(rollno).entrySet();
        for(Map.Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" :- "+entry.getValue());
        } 
    }
}
