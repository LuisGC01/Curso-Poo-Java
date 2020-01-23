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
public class Circulo extends FiguraGeometrica{

    public Circulo() {
    }

    public Circulo(double d1) {
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
        double a =Math.PI*Math.pow(getD1(), 2);
        return a;
    }

    @Override
    public double calcularPerimetro() {
        double a = 2*Math.PI*getD1();
        return a;
    }

    
    
    
    
}
