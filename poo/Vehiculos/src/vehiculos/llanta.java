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
public class llanta {
    private int tamanio;
    private String mmodelo;
    private String tipo;

    public llanta() {
    }

    public llanta(int tamanio, String mmodelo, String tipo) {
        this.tamanio = tamanio;
        this.mmodelo = mmodelo;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getMmodelo() {
        return mmodelo;
    }

    public void setMmodelo(String mmodelo) {
        this.mmodelo = mmodelo;
    }
    public void moverVehiculo(){
        System.out.println("moverVehiculo");
    } 
    public void frenaVehiculo(){
        
    }
    
    
}
