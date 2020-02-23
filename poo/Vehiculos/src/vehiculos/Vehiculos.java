/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author rober
 */
public class Vehiculos {
    private String modelo;
    private String color;
    private int velocidad;
    private Motor tipoMotor;
    private llanta tipoLllanta;
    private chasis tipoChasis;

    public Vehiculos() {
    }

    public Vehiculos(String modelo, String color, int velocidad, Motor tipoMotor, llanta tipoLllanta, chasis tipoChasis) {
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.tipoMotor = tipoMotor;
        this.tipoLllanta = tipoLllanta;
        this.tipoChasis = tipoChasis;
    }
      public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public llanta getTipoLllanta() {
        return tipoLllanta;
    }

    public void setTipoLllanta(llanta tipoLllanta) {
        this.tipoLllanta = tipoLllanta;
    }

    public chasis getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(chasis tipoChasis) {
        this.tipoChasis =tipoChasis;
    }
    public void trasportar(){
        System.out.println("trasportar");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    
    
}
