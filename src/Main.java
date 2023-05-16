import java.util.Scanner;

import net.salesianos.lib.Dictionary;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Dictionary dictionary = new Dictionary();

        boolean isActive = true;

        while(isActive){
            System.out.println("==================================");
            System.out.println("Por favor, introduzca una opcion: ");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");
            System.out.println("==================================");
            int option = Integer.parseInt(scanner.nextLine());

            switch(option){
                case 1:{
                    dictionary.addWord();
                    break;
                }case 2:{
                    dictionary.removeWord();
                    break;
                }case 3:{
                    dictionary.searchWord();
                    break;
                }case 4:{
                    dictionary.showInitials();
                    break;
                }case 5:{
                    dictionary.showWordsByInitials();
                    break;
                }case 6:{
                    System.out.println("Gracias por usar el programa");
                    isActive = false;
                    break;
                }default:{
                    System.out.println("Error de lectura, debe de introducir un solo numero del 1 al 6");
                    break;
                }
            }

        }
    }
}