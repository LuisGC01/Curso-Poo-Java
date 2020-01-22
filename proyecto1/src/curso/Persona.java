/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

/**
 *
 * @author usuario
 */

public class Persona {
    
    private String nombre;
    private int edad;
    private char genero;
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public char getGenero(){
        return this.genero;
    }
    
    public void setGenero(char g){
        this.genero=g;
    }
    
    public Persona(){
        
    }
    
    public Persona(String n,int e,char g){
        this.nombre=n;
        this.edad=e;
        this.genero=g;
    }

    public void mostrardatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Genero: "+this.genero);
    } 
}
