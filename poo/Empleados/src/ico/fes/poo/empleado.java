/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

import java.util.Iterator;

/**
 *
 * @author rober
 */
public class empleado {

    private String Nombre;
    private String departamento;
    private int sueldo;
    private int DiasTrabajados;
    private int HorasExtra;

    public empleado() {
    }

    public empleado(String Nombre, String departamento, int sueldo, int DiasTrabajados, int HorasExtra) {
        this.Nombre = Nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.DiasTrabajados = DiasTrabajados;
        this.HorasExtra = HorasExtra;
    }

    public int getHorasExtra() {
        return HorasExtra;
    }

    public void setHorasExtra(int HorasExtra) {
        this.HorasExtra = HorasExtra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;

    }
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiasTrabajados() {
        return DiasTrabajados;
    }

    public void setDiasTrabajados(int DiasTrabajados) {
        this.DiasTrabajados = DiasTrabajados;
    }
    @Override
    public String toString(){
        return  "\nNombre="  + Nombre  +  "\ndepartamento="  +  departamento  +  "\nsueldo=" +   sueldo + "$" +  "\nDiasTrabajados="  +   DiasTrabajados + "dias"  +  "\nHorasExtra=" +  HorasExtra + "horas" ;
   
    }
        
    }
     
