/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import Interfaces.Camera;
import Interfaces.InternetNavigator;
import Interfaces.MusicPlayer;
import java.util.Scanner;

/**
 *
 * @author mco_a
 */
public class Smartphone implements Camera, MusicPlayer, InternetNavigator {

    public String brand;
    public String model;
    public int option;

    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void takePhoto() {
        System.out.println("Tomando una foto con la cámara del smartphone.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Grabando un video con la cámara del smartphone."); 
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo música en el reproductor de música del smartphone."); 
    }

    @Override
    public void pause() {
        System.out.println("Pausando la reproducción de música."); 
    }
    
    @Override
    public void stop() {
        System.out.println("Deteniendo la reproducción de música.");
    }

    @Override
    public void search() {
  
        System.out.println("Realizando una búsqueda en Internet.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su búsqueda: ");
        String query = scanner.nextLine();
        System.out.println("Mostrando resultados de búsqueda para: " + query);
     
    }

    @Override
    public void refresh() {
        System.out.println("Actualizando la página web en el navegador del smartphone.");
    }
    
    
}
