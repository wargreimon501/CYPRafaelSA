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
public class Motor {
    private String modelo;
    private String marca;
    private int numeroSerie;

    public Motor() {
    }

    public Motor(String modelo, String marca, int numeroSerie) {
        this.modelo = modelo;
        this.marca = marca;
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void arrancar(){
        System.out.println("arrancar");
    }
    public void velocidadMax(){
        System.out.println("velocidadMax");
    }
}
