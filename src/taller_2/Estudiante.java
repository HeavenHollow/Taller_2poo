/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante( String nombre,int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Estudiante(){
        this("sin nombre", 0 );
    }
    
    public void mostrarEstudiante(){
        System.out.println("Nombre" + nombre);
        System.out.println("Edad" + edad);
    }
}
