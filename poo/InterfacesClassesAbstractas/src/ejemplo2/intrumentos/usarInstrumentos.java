/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.intrumentos;

/**
 *
 * @author rober
 */
public class usarInstrumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guitarra g= new Guitarra ();
        piano p= new piano();
        
        System.out.println(g.emitirSonido());
        
        System.out.println("+++++++++++++++++");
       
        System.out.println(p.emitirSonido());
        
        System.out.println(g.getTipoInstrumento());
        System.out.println(p.getTipoInstrumento());
        
               
    }
    
    
}
