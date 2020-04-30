/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosint;

import ico.fes.poo.computadora;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class ArreglosInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        System.out.println("Elem.5="+ numeros [4]);
        
        System.out.println("------------------------");
        for (int i = 0; i < numeros.length; i++) {
            int X = numeros[i];
            System.out.println(X);
        }
        numeros[0]=2;
        numeros[1]=1;
        numeros[2]=11;
        numeros[3]=-9;
        numeros[4]=2;
        numeros[5]=1;
        numeros[6]=11;
        numeros[7]=90;
        numeros[8]=101;
        numeros[9]=2;
    
        
        System.out.println("------------------------");
        for (int i = 0; i < numeros.length; i++) {
            int X = numeros[i];
            System.out.println(X);
        }
        float[] estaturas = new float[5];
        boolean [] flags = new boolean [10];
        flags[0]=true;
        flags[1]=false;
       
        System.out.println("++++vArreglo de la clase computadora ");
        computadora[] compus = new computadora [3];
        computadora c1 = new computadora();
        c1.setMarca("lenovo");
        c1.setModelo("Z1234");
        c1.setPrecio(11000.0f);
        
        compus [0]= c1;
        compus[1]= new computadora("hp", "pavillion", 15000);
        compus[2]= new computadora("Apple", "macbook",34500.0f );
        
        for (int i = 0; i < compus.length; i++) {
            computadora X = compus[i];
            System.out.println("computadora"+i+":");
            System.out.println(X);
        }
        ArrayList<computadora> lista= new ArrayList();
        
    }
    
    
    
}
