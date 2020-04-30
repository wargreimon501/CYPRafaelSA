
import ico.fes.poo.empleado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empleado emp1 = new empleado("Jose Garcia Perez", "Sistemas", 670, 30, 5);
        empleado emp2 = new empleado("Dana Herrera Perez", "Recursos Humanos", 450, 25, 0);
        empleado emp3 = new empleado("Jessica Juarez Dias", "Ventas", 400, 28, 0);
        empleado emp4 = new empleado("Pedro Paz Orozco", "Ventas", 410, 30, 0);
        empleado emp5 = new empleado("Jose Marcel Perez", "Sistemas", 680, 29, 6);
        empleado emp6 = new empleado("Jesus Dias Garcia", "Recursos Humanos", 455, 30, 0);
        empleado emp7 = new empleado("Pedro Xotla Ramirez", "Sistemas", 675, 27, 0);
        empleado emp8 = new empleado("Javier Medina Blanco", "Ventas", 400, 30, 4);
        empleado emp9 = new empleado("Elizabeth Villa SOsa", "Sistemas", 670, 30, 3);
        ArrayList<empleado> empa = new ArrayList();
        empa.add(emp1);
        empa.add(emp2);
        empa.add(emp3);
        empa.add(emp4);
        empa.add(emp5);
        empa.add(emp6);
        empa.add(emp7);
        empa.add(emp8);
        empa.add(emp9);
        int total =0;
        Iterator <empleado> em = empa.iterator();
        while (em.hasNext()){
           System.out.println(em.next());
        }
        empleado Mayor = Collections.min(empa, Comparator.comparing(c -> c.getDiasTrabajados()));
        empleado may =Collections.max(empa,Comparator.comparing(c -> c.getHorasExtra()));
        
         for (empleado empleado  : empa  ){
         int total1=0; 
         int total2=0;
         total = empleado.getSueldo() * 30 ;
         total1 = empleado.getHorasExtra() * 85 ;
         total2= empleado.getSueldo()*30 + empleado.getHorasExtra()*85 ;
         System.out.println("****************************************************");
         System.out.println("El empleado ;"+empleado.getNombre() +  "  tiene un sueldo mensual de ;"   + total +  "$");
         System.out.println("El empleado ;"+empleado.getNombre() +  "  tuvo una paga por sus horas extras es ; " + total1 + "$" );
         System.out.println("El empleado ;"+empleado.getNombre() +  "  su pago mensual mas sus horas estra es  ;"   + total2 +  "$");
         
          
    }
         System.out.println("***********************************************************************");
         System.out.println("El Empleado que menos dias trabajo este mes fue : " + Mayor.getNombre());
         System.out.println("El Empleado que mas horas extras trabajo este mes fue : " + may.getNombre());  

    
         
         } 
         
         
         
        
              
             
         }

             
         
         
         
         //System.out.println("-----------------------------------------------------------");
         //int total1=0; 
         //int total2=0;
         //int total3=0;
         //for (empleado empleado  : empa  ){
             //total1 = empleado.getHorasExtra() * 85 ;
            //total2= empleado.getSueldo()*30 + empleado.getHorasExtra()*85 ;
           
            
             
            
            
            
           
            
            
        
          
        
     
   
    

