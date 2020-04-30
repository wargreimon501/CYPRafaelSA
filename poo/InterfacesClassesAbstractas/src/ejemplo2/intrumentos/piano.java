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
public class piano implements intrumento {
    
    private int tipoInstrumento;

    public piano() {
    }

    public piano(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    @Override
    public boolean afinar() {
    boolean afinado=false;
        System.out.println("devemos checar todos los teclas ");
        System.out.println("checar que todas las teclas suenen bien ");
        afinado=true;
        return afinado;
        
    }
    @Override
    public String emitirSonido(){
        String sonido="";
        System.out.println("ton ton turururur tun tuntun tururururu");
        return sonido;
        
    }
    @Override
    public void limpiar(){
        System.out.println("limpar todo el piano");
        
    }

    public int getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    
}
    

    
    
    
    

