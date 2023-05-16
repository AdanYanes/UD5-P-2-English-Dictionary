package net.salesianos.lib;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {

    Scanner scanner = new Scanner(System.in);

    Map<String, Set<String>> dictionary;
    
    public Dictionary(){
        dictionary = new HashMap<>(); 
    }

    public void addWord(){
        System.out.println("Por favor, introduzca la palabra que desea introducir");

        String word = scanner.nextLine().replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();
        String initial = String.valueOf(word.charAt(0)).toUpperCase();

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

    public void searchWord(){
        System.out.println("Por favor, introduzca la palabra que desea buscar");
        String word = scanner.nextLine().replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();

        String initial = String.valueOf(word.charAt(0)).toUpperCase();

        if(checkIfInitialExist(initial)){
            Set<String> nextValues = dictionary.get(initial);
            if(nextValues.contains(word)){
                System.out.println("La palabra introducida se encuentra en el diccionario");
            }else{
                System.out.println("La palabra introducida no se encuentra en el diccionario");
            }
        }else{
            System.out.println("La palabra introducida no se encuentra en el diccionario");
        }
    }

    public void removeWord(){
        System.out.println("Por favor, introduzca la palabra que desea eliminar");
        String word = scanner.nextLine().replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();

        String initial = String.valueOf(word.charAt(0)).toUpperCase();

        if(checkIfInitialExist(initial)){
            Set<String> nextValues = dictionary.get(initial);
            if(nextValues.contains(word)){
                nextValues.remove(word);
                if(nextValues.isEmpty()){dictionary.remove(initial);}
                System.out.println("La palabra se ha eliminado correctamente");
            }else{
                System.out.println("La palabra introducida no se encuentra en el diccionario");
            }
        }else{
            System.out.println("La palabra introducida no se encuentra en el diccionario");
        }
    }

    public void showInitials(){
        Set<String> initialsSet = dictionary.keySet();
        
        if (dictionary.isEmpty()){
            System.out.println("Aun no hay iniciales con palabras almacenadas en este diccionario");
        }else{
            System.out.println("La iniciales con palabras almacenadas son: ");

            for (String initial : initialsSet) {
                System.out.println(initial);
            }
        }
    }

    private boolean checkIfInitialExist(String initial){
        Set<String> keySet = dictionary.keySet();

        return keySet.contains(initial);
    }

}
