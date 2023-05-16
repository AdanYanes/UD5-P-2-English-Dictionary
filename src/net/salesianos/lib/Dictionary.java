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

    public void addWord() {
        System.out.println("Por favor, introduzca la palabra que desea introducir");
        String word = getValidatedInput();
    
        String initial = getInitial(word);
    
        Set<String> nextValues = dictionary.computeIfAbsent(initial, k -> new HashSet<>());
        if (nextValues.contains(word)) {
            System.out.println("Esta palabra ya existe en el diccionario");
        } else {
            nextValues.add(word);
            System.out.println("Palabra agregada correctamente");
        }
    }
    
    public void searchWord() {
        System.out.println("Por favor, introduzca la palabra que desea buscar");
        String word = getValidatedInput();
    
        String initial = getInitial(word);
    
        Set<String> nextValues = dictionary.get(initial);
        if (nextValues != null && nextValues.contains(word)) {
            System.out.println("La palabra introducida se encuentra en el diccionario");
        } else {
            System.out.println("La palabra introducida no se encuentra en el diccionario");
        }
    }
    
    public void removeWord() {
        System.out.println("Por favor, introduzca la palabra que desea eliminar");
        String word = getValidatedInput();
    
        String initial = getInitial(word);
    
        Set<String> nextValues = dictionary.get(initial);
        if (nextValues != null && nextValues.contains(word)) {
            nextValues.remove(word);
            if (nextValues.isEmpty()) {
                dictionary.remove(initial);
            }
            System.out.println("La palabra se ha eliminado correctamente");
        } else {
            System.out.println("La palabra introducida no se encuentra en el diccionario");
        }
    }
    
    public void showInitials() {
        if (dictionary.isEmpty()) {
            System.out.println("Aun no hay iniciales con palabras almacenadas en este diccionario");
        } else {
            System.out.println("Las iniciales con palabras almacenadas son: ");
            dictionary.keySet().forEach(System.out::println);
        }
    }
    
    public void showWordsByInitials() {
        System.out.println("Por favor, introduzca la inicial que desea buscar");
        String initial = String.valueOf(scanner.nextLine().charAt(0)).toUpperCase();
    
        Set<String> nextValues = dictionary.get(initial);
        if (nextValues != null) {
            System.out.println("Las palabras almacenadas para esta inicial son: ");
            nextValues.forEach(System.out::println);
        } else {
            System.out.println("La inicial introducida no contiene palabras almacenadas");
        }
    }
    
    private String getValidatedInput() {
        return scanner.nextLine().replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();
    }
    
    private String getInitial(String word) {
        return String.valueOf(word.charAt(0)).toUpperCase();
    }
}    