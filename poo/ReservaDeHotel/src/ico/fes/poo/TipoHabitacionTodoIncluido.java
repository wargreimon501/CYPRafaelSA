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
public class TipoHabitacionTodoIncluido {
    private int sencilloTIN;
    private int dobleTIN;
    private int suiteTIN;
    private int kingTIN;
    private int precidencialTIN;

    public TipoHabitacionTodoIncluido() {
    }

    public TipoHabitacionTodoIncluido(int sencilloTIN, int dobleTIN, int suiteTIN, int kingTIN, int precidencialTIN) {
        this.sencilloTIN = sencilloTIN;
        this.dobleTIN = dobleTIN;
        this.suiteTIN = suiteTIN;
        this.kingTIN = kingTIN;
        this.precidencialTIN = precidencialTIN;
    }

    public int getSencilloTIN() {
        return sencilloTIN;
    }

    public void setSencilloTIN(int sencilloTIN) {
        this.sencilloTIN = sencilloTIN;
    }

    public int getDobleTIN() {
        return dobleTIN;
    }

    public void setDobleTIN(int dobleTIN) {
        this.dobleTIN = dobleTIN;
    }

    public int getSuiteTIN() {
        return suiteTIN;
    }

    public void setSuiteTIN(int suiteTIN) {
        this.suiteTIN = suiteTIN;
    }

    public int getKingTIN() {
        return kingTIN;
    }

    public void setKingTIN(int kingTIN) {
        this.kingTIN = kingTIN;
    }

    public int getPrecidencialTIN() {
        return precidencialTIN;
    }

    public void setPrecidencialTIN(int precidencialTIN) {
        this.precidencialTIN = precidencialTIN;
    }

    @Override
    public String toString() {
        return "TipoHabitacionTIN{" + "sencilloTIN=" + sencilloTIN + ", dobleTIN=" + dobleTIN + ", suiteTIN=" + suiteTIN + ", kingTIN=" + kingTIN + ", precidencialTIN=" + precidencialTIN + '}';
    }
    
    
    
}
