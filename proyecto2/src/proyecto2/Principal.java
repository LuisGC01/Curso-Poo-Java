/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chofer c1 = new Chofer(JOptionPane.showInputDialog("Ingrese el chofer por favor"));
        Taxi t1 = new Taxi();
        t1.setMatricula("TP-01");
        t1.setChofer(c1);
        JOptionPane.showMessageDialog(null,"El chofer es: "+ t1.printChofer()+"\n"+
                                           "La matricula es: "+t1.getMatricula());
        
        
        
    }
    
}
