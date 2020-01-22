/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException {
        /*     Persona p1;
        p1 = new Persona("Andres", 19, 'H');
        p1.mostrardatos();

        Persona p2;
        p2 = new Persona();
        p2.setNombre("Adrian");
        p2.setGenero('H');
        p2.setEdad(29);
        p2.mostrardatos();

        Coche c1 = new Coche();
        c1.setColor("rojo");
        c1.setKilometrajeMaximo(5000);
        c1.setNuevo(false);
        c1.setnLlantas(3);
        c1.setnPuertas(2);
        System.out.println("Acelera"+c1.acelerar(5));
        c1.encenderAuto(true);
        c1.encenderCalefaccion(true);
        System.out.println("COlor: "+c1.getColor());
        System.out.println("Kilometraje maximo: "+c1.getKilometrajeMaximo());
        if(c1.isNuevo()){
            System.out.println("Es nuevo");
        }else{
            System.out.println("No es nuevo");
        }
        System.out.println("tiene "+c1.getnLlantas()+" llantas");
        System.out.println("tiene "+c1.getnPuertas()+" puertas");
        
//        Coche c3= new Coche():
        
        Coche c2 = new Coche("verde", 6, false, 7000, 6);
        System.out.println("Acelera"+c2.acelerar(9));
        c2.encenderAuto(false);
        c2.encenderCalefaccion(true);
        System.out.println("COlor: "+c2.getColor());
        System.out.println("Kilometraje maximo: "+c2.getKilometrajeMaximo());
        if(c2.isNuevo()){
            System.out.println("Es nuevo");
        }else{
            System.out.println("No es nuevo");
        }
        System.out.println("tiene "+c2.getnLlantas()+" llantas");
        System.out.println("tiene "+c2.getnPuertas()+" puertas");
         */
        /*Persona p3 = new Persona();

        /*String n = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona");
        p3.setNombre(n);
         
        p3.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona"));
        JOptionPane.showMessageDialog(null, p3.getNombre());
        String s = JOptionPane.showInputDialog("Ingrese la edad");
        int a = Integer.parseInt(s);
        p3.setEdad(a);
        JOptionPane.showMessageDialog(null, p3.getEdad());
        s = JOptionPane.showInputDialog("Ingrese el genero");
        if (s.length() == 1) {
            char b = s.charAt(0);
            p3.setGenero(b);
            JOptionPane.showMessageDialog(null, p3.getGenero());

        } else {
            s = JOptionPane.showInputDialog("Ingrese el genero");
            char b = s.charAt(0);
            p3.setGenero(b);
            JOptionPane.showMessageDialog(null, p3.getGenero());
        }*/

        /*
        0,1,2,3,n
        a b c d e
        "a"
        "aasasdasdadd/0"
         */
        Coche c3 = new Coche();
        c3.setColor(JOptionPane.showInputDialog("Ingrese el color del coche"));
        c3.setKilometrajeMaximo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje maximo")));
        c3.setnLlantas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de llantas")));
        c3.setnPuertas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas")));
        int c=10; 
        while (!(c==0 || c==1) ) {            
            c= JOptionPane.showConfirmDialog(null, "¿es nuevo?");
        }
        if(c==1){
            c3.setNuevo(true);
        }else{
            c3.setNuevo(false);
        }
        
        JOptionPane.showMessageDialog(null, "color: "+c3.getColor());
        JOptionPane.showMessageDialog(null, "kilometraje maximo: "+c3.getKilometrajeMaximo());
        JOptionPane.showMessageDialog(null, "numero de llantas: "+c3.getnLlantas());
        JOptionPane.showMessageDialog(null, "puertas : "+c3.getnPuertas());
        if(c3.isNuevo()){
            JOptionPane.showMessageDialog(null, "Es nuevo");
        }else{
            JOptionPane.showMessageDialog(null, "No es nuevo");
        }
        
        
//        JOptionPane.showMessageDialog(null, c);
//c3.setNuevo(true);
    }

}
