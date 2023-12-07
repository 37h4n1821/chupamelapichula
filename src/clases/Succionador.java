/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;


/**
 *
 * @author ethan
 */
public class Succionador {
    private String nombre;
    private String rut;
    private LocalDate Fecha_Inicio;
    private int cap_suc;
    private int penes_chupados;

    public Succionador() {
    }
    

    public Succionador(String nombre, String rut, LocalDate Fecha_Inicio, int cap_suc, int penes_chupados) {
        this.nombre = nombre;
        this.rut = rut;
        this.Fecha_Inicio = Fecha_Inicio;
        this.cap_suc = cap_suc;
        this.penes_chupados = penes_chupados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(LocalDate Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public int getCap_suc() {
        return cap_suc;
    }

    public void setCap_suc(int cap_suc) {
        this.cap_suc = cap_suc;
    }

    public int getPenes_chupados() {
        return penes_chupados;
    }

    public void setPenes_chupados(int penes_chupados) {
        this.penes_chupados = penes_chupados;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Rut: "+rut+" Fecha: "+Fecha_Inicio+" capacidad de succion: "+cap_suc+" penes chupados: "+penes_chupados;
    }
    
    
    
    
}
