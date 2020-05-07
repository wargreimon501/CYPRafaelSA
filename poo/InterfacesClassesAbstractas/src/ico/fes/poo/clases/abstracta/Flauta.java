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
public class Flauta extends instrumento {

    private String TipoDeFlauta;

    public Flauta() {
    }

    public Flauta(String TipoDeFlauta) {
        this.TipoDeFlauta = TipoDeFlauta;
    }
    
    
    
    
    @Override
    public void tocar() {
        System.out.println("fiufiufiuf...fiufiu...");
    }

    @Override
    public void afinar() {
        System.out.println("la debes hervir con agua caliente desarmada y si no pedes la metes al agua despues la sacas la secas y la empiesas a tocar para ver como suena  ");
    }

    public String getTipoDeFlauta() {
        return TipoDeFlauta;
    }

    public void setTipoDeFlauta(String TipoDeFlauta) {
        this.TipoDeFlauta = TipoDeFlauta;
    }
    public Flauta (String TipoDeFlauta ,int anioConstruccion ,String marca){
        super(anioConstruccion, marca);
        this.TipoDeFlauta=TipoDeFlauta;
        
    }
    
}
