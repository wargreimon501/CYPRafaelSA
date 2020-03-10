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
public class trabajador {
    private float salario;
    private int ftc;
    private String Puesto;
    private String anioDeIngreso;

    public trabajador() {
    }

    public trabajador(float salario, int ftc, String Puesto, String anioDeIngreso) {
        this.salario = salario;
        this.ftc = ftc;
        this.Puesto = Puesto;
        this.anioDeIngreso = anioDeIngreso;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getFtc() {
        return ftc;
    }

    public void setFtc(int ftc) {
        this.ftc = ftc;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(String anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }
    public String ventas(String vendio){
        String venta="lo que vendi"+vendio;
        return venta;
    }
    public String cobro(String cobrar){
        String cobro="cobrare"+cobrar;
        return cobro;
    }
    public void trabajoComputadora(){
        
    }
    public void limpieza(){
        
    }
    
}
