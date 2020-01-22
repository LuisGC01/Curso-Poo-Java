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
public class Coche {

    private String color;
    private int nLlantas;
    private boolean nuevo;
    private int kilometrajeMaximo;
    private int nPuertas;

    public Coche() {
    }
    
    public Coche(String color) {
        this.color = color;
    }
    

    public Coche(String color, int nLlantas, boolean nuevo, int kilometrajeMaximo, int nPuertas) {
        this.color = color;
        this.nLlantas = nLlantas;
        this.nuevo = nuevo;
        this.kilometrajeMaximo = kilometrajeMaximo;
        this.nPuertas = nPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnLlantas() {
        return nLlantas;
    }

    public void setnLlantas(int nLlantas) {
        this.nLlantas = nLlantas;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public int getKilometrajeMaximo() {
        return kilometrajeMaximo;
    }

    public void setKilometrajeMaximo(int kilometrajeMaximo) {
        this.kilometrajeMaximo = kilometrajeMaximo;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    
    public void encenderAuto(boolean t){
        if (t==true) {
            System.out.println("Auto encendido");
        }else{
            System.out.println("Auto apago");
        }
    }
    
    public double acelerar(double rc){
        double v=0;
        v=v+rc;
        return v;
    }
    
    public void encenderCalefaccion(boolean b) throws InterruptedException{
        if (b==true) {
            System.out.println("Encendiendo calefaccion");
            Thread.sleep(3000);
            System.out.println("Calefaccion encendida");
        } else {
            System.out.println("Apagando calefaccion");
            Thread.sleep(3000);
            System.out.println("Calefaccion apagada");
        }
    }
}
