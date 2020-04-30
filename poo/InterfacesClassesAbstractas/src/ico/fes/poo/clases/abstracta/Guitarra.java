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
public class Guitarra extends instrumento  {
    private int numeroDeCuerda;

    public Guitarra() {
    }

    public Guitarra(int numeroDeCuerda) {
        this.numeroDeCuerda = numeroDeCuerda;
    }

    public Guitarra(int numeroDeCuerda, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroDeCuerda = numeroDeCuerda;
    }

    public int getNumeroDeCuerda() {
        return numeroDeCuerda;
    }

    public void setNumeroDeCuerda(int numeroDeCuerda) {
        this.numeroDeCuerda = numeroDeCuerda;
    }

    @Override
    public void afinar() {
        System.out.println("precionando el traste 2 cuerda 5");
        System.out.println("tocamcuerda 5");
        System.out.println("ajustar asta que las cuerdad suenen igual");
        System.out.println("repetir operaci asta la cuerda 1");
        
    }

    @Override
    public void tocar() {
        System.out.println("tara....tara.....");
    }
    
    
    
}
