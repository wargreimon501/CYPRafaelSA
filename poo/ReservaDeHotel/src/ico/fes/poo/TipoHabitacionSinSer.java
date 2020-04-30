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
public class TipoHabitacionSinSer {
    private int sencillo;
    private int doble;
    private int suite;
    private int king;
    private int precidencial;

    public TipoHabitacionSinSer() {
    }

    public TipoHabitacionSinSer(int sencillo, int doble, int suite, int king, int precidencial) {
        this.sencillo = sencillo;
        this.doble = doble;
        this.suite = suite;
        this.king = king;
        this.precidencial = precidencial;
    }

    public int getPrecidencial() {
        return precidencial;
    }

    public void setPrecidencial(int precidencial) {
        this.precidencial = precidencial;
    }

    public int getSencillo() {
        return sencillo;
    }

    public void setSencillo(int sencillo) {
        this.sencillo = sencillo;
    }

    public int getDoble() {
        return doble;
    }

    public void setDoble(int doble) {
        this.doble = doble;
    }

    public int getSuite() {
        return suite;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public int getKing() {
        return king;
    }

    public void setKing(int king) {
        this.king = king;
    }

    @Override
    public String toString() {
        return "TipoHabitacionSencilla{" + "sencillo=" + sencillo + ", doble=" + doble + ", suite=" + suite + ", king=" + king + ", precidencial=" + precidencial + '}';
    }
    
    
    
    
}
