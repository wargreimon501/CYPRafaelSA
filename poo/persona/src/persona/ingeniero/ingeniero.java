/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.ingeniero;

import persona.Persona;


        
/**
 *
 * @author rober
 */
public class ingeniero extends Persona{
    
    int semestre;
    String carrera;

    public ingeniero() {
    }

    public ingeniero(int semestre, String carrera) {
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public ingeniero(int semestre, String carrera, String nombre, int fechaDeNacimiento, int curp, String sexo) {
        super(nombre, fechaDeNacimiento, curp, sexo);
        this.semestre = semestre;
        this.carrera = carrera;
    }
     
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
