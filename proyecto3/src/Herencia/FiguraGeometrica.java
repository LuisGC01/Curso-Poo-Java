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
public abstract class FiguraGeometrica {
    double d1;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(double d1) {
        this.d1 = d1;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }
    
    public double calcularArea(){
        double r = 0;
        return r;
    }
    
    public double calcularPerimetro(){
        double r = 0;
        return r;
    }
}
