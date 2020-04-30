/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.ecepciones;

/**
 *
 * @author rober
 */
public class fuerarangoecepcion extends Exception{

    @Override
    public String getMessage() {
        return "operador fuera de rango 1 -> suma ,2 ->resta , 3-> mul , 4 -> div ";
    }
    
    
}
