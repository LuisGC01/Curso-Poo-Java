/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica f;
        Circulo circulo1 = new Circulo(9);
        Cuadrado cuadrado1 = new Cuadrado(9);
        Rectangulo rectangulo1 = new Rectangulo(9,17);
        Triangulo triangulo1= new Triangulo(9,17);
        /*JOptionPane.showMessageDialog(null, "El area del circulo es: "+circulo1.calcularArea());
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: "+circulo1.calcularPerimetro());
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+cuadrado1.calcularArea());
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+cuadrado1.calcularPerimetro());
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+rectangulo1.calcularArea());
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+rectangulo1.calcularPerimetro());
        JOptionPane.showMessageDialog(null, "El area del triangulo es: "+triangulo1.calcularArea());
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: "+triangulo1.calcularPerimetro());
        */
        f=circulo1;
        System.out.println(f.calcularArea());
        System.out.println(f.calcularPerimetro());
        f=triangulo1;
        System.out.println(f.calcularArea());
        System.out.println(f.calcularPerimetro());
        f=rectangulo1;
        System.out.println(f.calcularArea());
        System.out.println(f.calcularPerimetro());
        f=cuadrado1;
        System.out.println(f.calcularArea());
        System.out.println(f.calcularPerimetro());
        
    }
}
