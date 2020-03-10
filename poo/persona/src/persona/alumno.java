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
public class alumno 
{
private int numreoCuenta;
private String carrera;
private float promedio;

    public alumno() {
    }

    public alumno(int numreoCuenta, String carrera, float promedio) {
        this.numreoCuenta = numreoCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }
  public int getNumreoCuenta() {
        return numreoCuenta;
    }

    public void setNumreoCuenta(int numreoCuenta) {
        this.numreoCuenta = numreoCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    public String estudiar(String materia){
        String estudiar="estudio"+materia;
        return estudiar;
     
               
    }
    public String bebio(String queBebio){
        String bebio="lo que bebi fue"+ queBebio;
                return bebio;
    } 
    public void llorar(){
        
    }
    public void estresarte(){
        
    }
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   }
    public void mostrarResultado(String queBebio){
        System.out.println("bebio"+ queBebio);
    }
    }
    
