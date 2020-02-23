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
public class chasis {
    private int tamanio;
    private String modelo;
    private String color;

    public chasis() {
    }

    public chasis(int tamanio, String modelo, String color) {
        this.tamanio = tamanio;
        this.modelo = modelo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void sostenerVehiculo(){
        System.out.println("sostenerVehiculo");
    } 
    public void recibirImpactos(){
        System.out.println("recibirImpactos");
    }
    
}
