package com.stringexample;
/**
 *
 * @author Chirag
 */
public class ArrangeCities {
    public static void main(String args[]){
        String cities[]={"Bhopal","Bhangarh","Agra","Mumbai","Mumbai","Chennai","Pune","Delhi"};
        String tmp;
        for (String citi : cities) {
            for(int j=0;j<cities.length-1;j++){
                if(cities[j].compareTo(cities[j+1]) > 0){
                    tmp = cities[j];
                    cities[j] = cities[j+1];
                    cities[j+1] = tmp;
                } else {
                }
            }
        }
        for(String city:cities){
            System.out.println(city);
        }
    }
}
