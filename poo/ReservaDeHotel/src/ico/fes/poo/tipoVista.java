/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author rober
 */
public class tipoVista {
    private int alMar;
    private int aCampoDeGolf;

    public tipoVista() {
    }

    public tipoVista(int alMar, int aCampoDeGolf) {
        this.alMar = alMar;
        this.aCampoDeGolf = aCampoDeGolf;
    }

    public int getaCampoDeGolf() {
        return aCampoDeGolf;
    }

    public void setaCampoDeGolf(int aCampoDeGolf) {
        this.aCampoDeGolf = aCampoDeGolf;
    }

    public int getAlMar() {
        return alMar;
    }

    public void setAlMar(int alMar) {
        this.alMar = alMar;
    }

    @Override
    public String toString() {
        return "tipoVista{" + "alMar=" + alMar + ", aCampoDeGolf=" + aCampoDeGolf + '}';
    }
    
    
}
