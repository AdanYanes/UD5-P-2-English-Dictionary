package net.salesianos.lib;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dictionary {

    Map<String, Set<String>> dictionary;
    
    public Dictionary(){
        dictionary = new HashMap<>(); 
    }

    public void addWord(String inputWord){
        String initial = String.valueOf(inputWord.charAt(0)).toUpperCase();

        String word = inputWord.replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();

        if(checkIfInitialExist(initial)){
            Set<String> nextValues = dictionary.get(initial);
            if(nextValues.contains(word)){
                System.out.println("Esta palabra ya existe en el diccionario");
            }else{
                nextValues.add(word);
                dictionary.put(initial, nextValues);
            }
        }else{
            Set<String> newValues = new HashSet<>();
            newValues.add(word);
            dictionary.put(initial, newValues);
        }
    }

    private boolean checkIfInitialExist(String initial){
        Set<String> keySet = dictionary.keySet();

        return keySet.contains(initial);
    }

}
