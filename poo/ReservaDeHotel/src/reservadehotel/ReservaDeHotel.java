/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadehotel;
import java.util.Scanner;
import ico.fes.poo.TipoHabitacionSinSer;
import ico.fes.poo.TipoHabitacionTodoIncluido;
import ico.fes.poo.tipoVista;
/**
 *
 * @author rober
 */
public class ReservaDeHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in); 
        
        TipoHabitacionSinSer HS=new TipoHabitacionSinSer();
        HS.setSencillo(1600);
        HS.setDoble(2650);
        HS.setSuite(4890);
        HS.setKing(6250);
        HS.setPrecidencial(8100);
        TipoHabitacionTodoIncluido HTI=new TipoHabitacionTodoIncluido();
        HTI.setSencilloTIN(2200);
        HTI.setDobleTIN(3650);
        HTI.setSuiteTIN(5950);
        HTI.setKingTIN(7850);
        HTI.setPrecidencialTIN(9950);
        tipoVista TVI = new tipoVista();
        TVI.setAlMar(350);
        TVI.setaCampoDeGolf(200);
       
        
        System.out.println(HS);
        System.out.println(HTI);
        System.out.println(TVI);
        String reservacion ="";
        String tipoDeCuarto="";
        String queTipoVista="";
       
        System.out.println("que tipo de servicio quieres sencillo o con todo incluido");
        reservacion = entrada.nextLine();
        System.out.println("que tipo de habitacion decea");
        tipoDeCuarto = entrada.nextLine();
        System.out.println("que tipo de vista desea ;");
        queTipoVista=entrada.nextLine();
        
        System.out.println("tu reservacion sera esta ; "+ "\n" + "tu tipo de servicio ; "  +  reservacion + "\n"  + "tu cuarto es ;" + tipoDeCuarto + "\n" + "tu vista sera ;" + queTipoVista + "\n");
        
        //no puedo aser la suma para dar el´precio no se como hacerlo 
        
        
    
    }
    
}
