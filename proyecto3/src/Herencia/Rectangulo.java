/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

public class Rectangulo extends FiguraGeometrica{
    private double d2;

    public Rectangulo() {
    }

    public Rectangulo(double d2) {
        this.d2 = d2;
    }

    public Rectangulo(double d2, double d1) {
        super(d1);
        this.d2 = d2;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    @Override
    public double calcularArea() {
        double a = getD1()*getD2();
        return a;
    }

    @Override
    public double calcularPerimetro() {
        double p = (2*getD1())+(2*getD2());
        return p;
    }
    
    
    
}
