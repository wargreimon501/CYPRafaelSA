/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clases.abstracta;

/**
 *
 * @author rober
 */
public class Piano extends instrumento{
    private String TipoDePiano;

    public Piano() {
    }

    public Piano(String TipoDePiano) {
        this.TipoDePiano = TipoDePiano;
    }

    public Piano(String TipoDePiano, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.TipoDePiano= TipoDePiano;
        
    }

    public String getTipoDePiano() {
        return TipoDePiano;
    }

    public void setTipoDePiano(String TipoDePiano) {
        this.TipoDePiano = TipoDePiano;
    }

    @Override
    public void tocar() {
        System.out.println("tun ...tuntun...tunrunrurun");
       
    }

    @Override
    public void afinar() {
        System.out.println("toca las teclas para checar que sueen bien y que suene a su nota "); 
        System.out.println("limpiar las teclas ....");
    }
    }
    

