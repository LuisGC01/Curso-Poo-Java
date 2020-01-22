/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author usuario
 */
public class Taxi {
    private Chofer chofer;
    private String matricula;

    public Taxi() {
    }

    public Taxi(Chofer chofer, String matricula) {
        this.chofer = chofer;
        this.matricula = matricula;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String printChofer(){
        return this.chofer.getNombre();
    }
    
}
