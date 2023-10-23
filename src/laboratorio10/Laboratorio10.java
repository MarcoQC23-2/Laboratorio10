/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio10;

import Clase.Smartphone;
import java.util.Scanner;

/**
 *
 * @author mco_a
 */
public class Laboratorio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("----------------Menu-----------------");
            System.out.println("1. Encender el móvil\n2. Apagar el móvil\n0. Salir");
            System.out.print("Elija una opcion:");
            option = scanner.nextInt();
            
            switch (option) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println("¡Bienvenido! El smartphone " + "Samsung" + " " + "S21" + " se ha encendido.");
                    System.out.println("Menu");
                    System.out.println("1. Camara\n2. Reproductor\n3. Navegador de internet");
                    System.out.print("Elija una opcion:");
                    option = scanner.nextInt();
                    Smartphone myPhone = new Smartphone("Samsung", "Galaxy S21");
                    if(option == 1){
                        myPhone.takePhoto();
                    } else if(option == 2){
                        myPhone.play();
                        myPhone.pause();
                        myPhone.stop();
                    } else if(option == 3){
                        myPhone.search();
                        myPhone.refresh();
                    }
                    break;
                case 2:
                    System.out.println("El smartphone se ha apagado. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 0);
    }
}
    

