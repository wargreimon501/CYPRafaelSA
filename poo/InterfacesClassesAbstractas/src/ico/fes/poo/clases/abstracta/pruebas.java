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
public class pruebas {
    public static void main(String[] args) {
        Guitarra g = new Guitarra(6, 1967, "gibson");
        System.out.println(g.getAnioConstruccion() );
        g.afinar();
        g.tocar();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Piano p = new Piano("piano de un cuarto de cola ", 1810, "steinway and sons");
        System.out.println(p.getAnioConstruccion() +       p.getMarca()       +     p.getTipoDePiano());
        p.afinar();
        p.tocar();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        Flauta f =new Flauta("flauta trasversa", 1832, "yamaha YLF-272SL");
        System.out.println(f.getAnioConstruccion() +      f.getMarca() +   f.getTipoDeFlauta());
        f.afinar();
        f.tocar();
    }
}
