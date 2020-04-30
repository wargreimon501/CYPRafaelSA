/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecepcionesjava;

import ico.fes.poo.calculadora;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Ecepcionesjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
        int x = 10;
        System.out.print("ingrtesa un entero:");
        int y =teclado.nextInt();
       int z=0;
       int w =0;
       System.out.println("dividir entero");
        try { 
       z = x/y;
      w =10/ Integer.parseInt("uydutdjg");
       }
        catch(ArithmeticException e ){
            JOptionPane.showMessageDialog(null, "no se permite introducir el numero 0" );
            System.out.println("info del error"+ e.toString());
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            System.out.println("no es una una String valido para un numero ");
        }
        catch(Exception e){
            System.out.println("todo los demas errores identifiados ");
        }
        finally{
            //tarea de limpieza
            //z=-1;
            y=0;
    }
        System.out.println("resultado es ;" +z);
        System.out.println("resltado es ;" + w);
        System.out.println("final de prrograma...");
        System.out.println("si se imprime esta linia"+"quiere desir que todo salio bien");
        System.out.println("ejemplo de la calculador");
        calculadora calc= new calculadora();
        calc.setOperando1(10.0f);
            calc.setOperando2(3.0f);
            try {
            calc.setOperador(5);
            
        } catch (Exception ex) {
            System.out.println("error : "+ ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    
   
}
