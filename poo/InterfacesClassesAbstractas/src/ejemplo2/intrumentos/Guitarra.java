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
public class Guitarra implements intrumento{
  
    private int tipoInstrumento;

    public Guitarra() {
    }

    public Guitarra(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    
    
    @Override
   public boolean afinar(){
       boolean afinado= false; 
               
       System.out.println("presiona traste 3 cuerda 5 y comparar");
       System.out.println("detener asta que el final suene bien ");
       System.out.println("hacer lo mismo pero asta llegar ala cuerda 1");
       afinado=true;
       return afinado;
       
}
@Override
public String emitirSonido(){
    String sonido="";
    sonido ="tara ,,,, tara ,,,la guitarra";
            return sonido; 
}
@Override
public void limpiar(){
    System.out.println("limpiando el brazo");
    System.out.println("limpiando el cuerpo ");
    System.out.println("limpiando maquinaria ");
}

    public int getTipoInstrumento() {
        return tipoInstrumento;
    }
//este sera ignorado
    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }




}

