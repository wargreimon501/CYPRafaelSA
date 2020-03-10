/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author rober
 */
public class Persona {

    private String nombre;
    private int fechaDeNacimiento;
    private int curp;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int fechaDeNacimiento, int curp, String sexo) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.curp = curp;
        this.sexo = sexo;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getCurp() {
        return curp;
    }

    public void setCurp(int curp) {
        this.curp = curp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void caminar(){
        System.out.println("caminar");
    }
    public void comer(){
     
    }
    public void mostrarResultado(String queBebio){
        System.out.println("bebio"+ queBebio);
    }  
}