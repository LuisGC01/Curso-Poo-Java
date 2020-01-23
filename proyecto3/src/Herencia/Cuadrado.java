/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author usuario
 */
public class Cuadrado extends FiguraGeometrica{

    public Cuadrado() {
    }

    public Cuadrado(double d1) {
        super(d1);
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    @Override
    public double calcularArea() {
        //double a = Math.pow(getD1(), 2);
        double a = getD1()*getD1();
        return a;
    }

    @Override
    public double calcularPerimetro() {
        double p = getD1()*4;
        return p;
    }
    
    
    
}
