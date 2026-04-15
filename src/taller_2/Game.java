/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2;

/**
 *
 * @author ASUS
 */
public class Game {
    String nombre;
    
    //ERROR
    /*public static void metodoEstatico() {
        System.out.println(this.nombre); 
      }*/
    
    
    // solucion 1 quitando el static 
    
   /* public void game() {
    System.out.println(this.nombre); // ✔ válido
}*/
    
    // no usando el this 
    
    /*public static void metodoEstatico() {
    System.out.println("Método estático sin usar this");
}*/
    
     public Game(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println(this.nombre);
    }
    
    
}


